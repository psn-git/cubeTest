package ch.nuedling.basics;

public class PointPosition {
	private Point point;
	private Angles anglesToZero;
	private Double distanceFromZero = 0.0;

	public PointPosition(Point point) {
		super();
		this.point = point;
		try {
			this.anglesToZero = getInternalAnglesToZero();
		} catch (PointDefinitionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (AngleDefinitionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			this.distanceFromZero = getInternalDistanceFromZero();
		} catch (PointDefinitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Point getPoint(){
		return this.point;
	}

	public double getDistanceFromZero() {
		return this.distanceFromZero;
	}

	public Integer getX() {
		return point.getX();
	}

	public Integer getY() {
		return point.getY();
	}

	public Integer getZ() {
		return point.getZ();
	}

	public Angles getAnglesToZero() {
		return anglesToZero;
	}

	private Double calculateDistanceBetweenTwoPoints(Point point1, Point point2) {
		PointToPointDistance pTopDistance = new PointToPointDistance();
		try {
			pTopDistance = Point.calculateAbsoluteCoordinatesDifferences(
					point1, point2);
		} catch (CoordinatesSystemDefinitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Double distance;
		distance = Math.sqrt(Math.pow(pTopDistance.getDeltaX(), 2)
				+ Math.pow(pTopDistance.getDeltaY(), 2)
				+ Math.pow(pTopDistance.getDeltaZ(), 2));

		return distance;
	}

	public Angles getAnglesToPoint(Point point) {
		try {
			return getInternalAnglesToPoint(point);
		} catch (AngleDefinitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	private Angles getInternalAnglesToPoint(Point point)
			throws AngleDefinitionException {

		Angles angles;

		Double elevation = calculateElevationToPoint(this.point, point);
		Double azimuth = calculateAzimuthToPoint(this.point, point);
		angles = new Angles(elevation, azimuth);
		return angles;
	}

	private Angles getInternalAnglesToZero() throws PointDefinitionException,
			AngleDefinitionException {
		return getInternalAnglesToPoint(new Point(this.point
				.getCoordinatesSystemDefinition().getZeroPoint(),
				this.point.getCoordinatesSystemDefinition()));
	}

	private Integer getElevationQuadrant(PointToPointDistance value) throws QuadrantCalculationException {
		if ((value.getDeltaX() > 0) && (value.getDeltaZ() >= 0)) {
			return 1;
		} else if ((value.getDeltaX() <= 0) && (value.getDeltaZ() > 0)) {
			return 2;
		}
		if ((value.getDeltaX() < 0) && (value.getDeltaZ() <= 0)) {
			return 3;
		}
		if ((value.getDeltaX() >= 0) && (value.getDeltaZ() < 0)) {
			return 4;
		}
		throw new QuadrantCalculationException(value.toString());
	}

	private Integer getAzimuthQuadrant(PointToPointDistance value) throws QuadrantCalculationException {
		if ((value.getDeltaX() > 0) && (value.getDeltaY() >= 0)) {
			return 1;
		} else if ((value.getDeltaX() <= 0) && (value.getDeltaY() > 0)) {
			return 2;
		}
		if ((value.getDeltaX() < 0) && (value.getDeltaY() <= 0)) {
			return 3;
		}
		if ((value.getDeltaX() >= 0) && (value.getDeltaY() < 0)) {
			return 4;
		}
		throw new QuadrantCalculationException(value.toString());
	}
	
	private Double calculateElevationToPoint(Point point1, Point point2) {
		PointToPointDistance absoluteP2pDistance = null;
		try {
			absoluteP2pDistance = Point
					.calculateAbsoluteCoordinatesDifferences(point1, point2);
		} catch (CoordinatesSystemDefinitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PointToPointDistance p2pDistance = null;
		try {
			p2pDistance = Point.calculateCoordinatesDifferences(point1, point2);
		} catch (CoordinatesSystemDefinitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Double angleB = 0.0;
		Double c1 = 0.0;
		if (absoluteP2pDistance.getDeltaX() == 0.0
				&& absoluteP2pDistance.getDeltaZ() == 0.0){
			return 0.0;
		}
				
		if (absoluteP2pDistance.getDeltaX() != 0.0
				|| absoluteP2pDistance.getDeltaY() != 0.0
				|| absoluteP2pDistance.getDeltaZ() != 0.0) {

			c1 = Math.sqrt(Math.pow(absoluteP2pDistance.getDeltaX(), 2)
					+ Math.pow(absoluteP2pDistance.getDeltaY(), 2));

		}
		if (c1 > 0) {
			Double c = calculateDistanceBetweenTwoPoints(point1, point2);
			angleB += Math.toDegrees(Math.acos(c1 / c));
			if (Double.isNaN(angleB)) {
				angleB = 0.0;
			}
		}
		try {
			switch (getElevationQuadrant(p2pDistance)) {
			case 1:
				angleB += 0.0;
				break;
			case 2:
				if (angleB > 0.0) {
					angleB = 90 - angleB;
				}	
				angleB += 90.0;
				break;
			case 3:
				angleB += 180.0;
				break;
			case 4:
				if (angleB > 0.0) {
					angleB = 90 - angleB;
				}
				angleB += 270.0;

				break;

			}
		} catch (QuadrantCalculationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return angleB;
	}

	private Double calculateAzimuthToPoint(Point point1, Point point2) {
		PointToPointDistance absoluteP2pDistance = null;
		try {
			absoluteP2pDistance = Point
					.calculateAbsoluteCoordinatesDifferences(point1, point2);
		} catch (CoordinatesSystemDefinitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PointToPointDistance p2pDistance = null;
		try {
			p2pDistance = Point.calculateCoordinatesDifferences(point1, point2);
		} catch (CoordinatesSystemDefinitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Double angleB = 0.0;
		Double c1 = 0.0;
		if (absoluteP2pDistance.getDeltaX() == 0.0
				&& absoluteP2pDistance.getDeltaY() == 0.0) {
		  return 0.0;	
		}
		
		if (absoluteP2pDistance.getDeltaX() != 0.0
				|| absoluteP2pDistance.getDeltaY() != 0.0
				|| absoluteP2pDistance.getDeltaZ() != 0.0) {

			c1 = Math.sqrt(Math.pow(absoluteP2pDistance.getDeltaX(), 2)
					+ Math.pow(absoluteP2pDistance.getDeltaZ(), 2));

		}
		if (c1 > 0) {
			Double c = calculateDistanceBetweenTwoPoints(point1, point2);
			angleB += Math.toDegrees(Math.acos(c1 / c));
			if (Double.isNaN(angleB)) {
				angleB = 0.0;
			}
		}
		try {
			switch (getAzimuthQuadrant(p2pDistance)) {
			case 1:
				angleB += 0.0;
				break;
			case 2:
				if (angleB > 0.0) {
					angleB = 90 - angleB;
				}	
				angleB += 90.0;
				break;
			case 3:
				angleB += 180.0;
				break;
			case 4:
				if (angleB > 0.0) {
					angleB = 90 - angleB;
				}
				angleB += 270.0;

				break;

			}
		} catch (QuadrantCalculationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return angleB;
	}

	private Double getInternalDistanceFromZero()
			throws PointDefinitionException {
		return calculateDistanceBetweenTwoPoints(
				new Point(
						point.getCoordinatesSystemDefinition().getZeroPoint(),
						point.getCoordinatesSystemDefinition()), point);
	}

	public Double getDistanceFromPoint(Point point) {
		return calculateDistanceBetweenTwoPoints(point, this.point);
	}
}
