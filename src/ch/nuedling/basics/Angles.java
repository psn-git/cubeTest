package ch.nuedling.basics;

public class Angles {
	private Double elevation = 0.0;
	private Double azimuth = 0.0;

	public Angles(double elevation, double azimuth)
			throws AngleDefinitionException {

		if (elevation < 360 && elevation >= 0) {
			this.elevation = elevation;
		} else {
			throw new AngleDefinitionException(String.format(
					"with elevation angle: elevation = %f ", elevation));
		}
		if (azimuth < 360 && azimuth >= 0) {
			this.azimuth = azimuth;
		} else {
			throw new AngleDefinitionException(String.format(
					"with azimuth angle: elevation = %f ", azimuth));
		}
	}

	public Double getElevation() {
		return elevation;
	}

	public Double getAzimuth() {
		return azimuth;
	}

	public static Double getDifferenceBetweenDirectionAndAngle(
			Double direction, Double angle) {
		Double difference = 0.0;

		if (angle > direction) {
			difference = angle - direction;

			if (360 - difference < difference) {
				difference = 360 - difference;
				return difference;
			} else {
				return difference;
			}
		} else if (direction > angle) {
			difference = direction - angle;
			if (360 - difference < difference) {
				difference = 360 - difference;
				return difference;
			} else {
				return difference;
			}
		}
		return difference;
	}

	public static Boolean isValueInTorerance(Double direction, Double angle,
			Double tolerance) {
		Double tolerancePercent = direction / 100 * tolerance;
		Boolean result = false;
		Double maxValue = 0.0, minValue = 0.0;

		if ((tolerancePercent == 0) && (tolerance != 0)) {
			tolerancePercent = tolerance * 0.5;
		}

		maxValue = direction + tolerancePercent;
		if (maxValue > 360) {
			maxValue = maxValue - 360;
		}

		minValue = direction - tolerancePercent;
		if (minValue < 0) {
			minValue = 360 + minValue;

			if (angle >= minValue) {
				result = true;
				return result;
			}

			if ((angle <= maxValue) && (minValue >= 0)) {
				result = true;
				return result;
			}
		}

		if (!result && ((angle <= maxValue) && (angle >= minValue))) {
			result = true;
		}

		return result;
	}

	public static Boolean isAngleInRangeAndTolerance(Angles value,
			Angles direction, Double tolerance) {
		Boolean result = false;

		result = isValueInTorerance(direction.getElevation(),
				value.getElevation(), tolerance);
		if (result) {
			if ((direction.getElevation() == 0.0)
					|| (value.getElevation() == 0.0)
					|| (direction.getElevation() == 90.0)
					|| (value.getElevation() == 90.0)
					|| (direction.getElevation() == 180.0)
					|| (value.getElevation() == 180.0)
					|| (direction.getElevation() == 270.0 || (value
							.getElevation() == 270.0))) {
				return true;

			} else {
				return isValueInTorerance(direction.getAzimuth(),
						value.getAzimuth(), tolerance);
			}
		}

		return false;
	}

	public Double getWeight(Angles target, Double maxTolerance) {
		final Double maxResult = 200.0;
		Double elevationValue, azimuthValue, result = 0.0;

		elevationValue = getDifferenceBetweenDirectionAndAngle(
				target.elevation, this.elevation);
		elevationValue = elevationValue * 1 / maxTolerance * 100;

		azimuthValue = getDifferenceBetweenDirectionAndAngle(target.azimuth,
				this.azimuth);
		azimuthValue = azimuthValue * 1 / maxTolerance * 100;
		result = (elevationValue + azimuthValue);
		if (Double.isNaN(result)||result.equals(0.0)) {
			return 0.0;
		} else if (result > maxResult) {
			try {
				throw new AngleWrongResultException("result = " + result
						+ " but expected < " + maxResult);
			} catch (AngleWrongResultException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result / 2;
	}

}