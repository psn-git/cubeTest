package ch.nuedling.basics;

public class CoordinatesSystemDefinition {
	private BasePoint highestPoint;
	private BasePoint lowestPoint;
	private BasePoint zeroPoint;

	public BasePoint getZeroPoint() {
		return zeroPoint;
	}

	public BasePoint getHighestPoint() {
		return highestPoint;
	}

	public BasePoint getLowestPoint() {
		return lowestPoint;
	}
	
	public boolean equals(CoordinatesSystemDefinition csd){
		
		return this.highestPoint.equals(csd.highestPoint) &&
			   this.lowestPoint.equals(csd.lowestPoint) &&
			   this.zeroPoint.equals(csd.zeroPoint);
	}

	public CoordinatesSystemDefinition(BasePoint highestPoint,
			BasePoint lowestPoint, BasePoint zeroPoint) throws CoordinatesSystemDefinitionException {
		super();
		if (highestPoint.getX() > lowestPoint.getX()
				&& highestPoint.getY() > lowestPoint.getY()
				|| highestPoint.getZ() > lowestPoint.getZ()) {
			this.highestPoint = highestPoint;
			this.lowestPoint = lowestPoint;
		} else {
			throw new CoordinatesSystemDefinitionException(
					"wrong highest or lowest coordinates definition");
		}

		if ((zeroPoint.getX() <= highestPoint.getX()
				&& zeroPoint.getY() <= highestPoint.getY() && zeroPoint.getZ() <= highestPoint
				.getZ())
				&& (zeroPoint.getX() >= lowestPoint.getX()
						&& zeroPoint.getY() >= lowestPoint.getY() && zeroPoint
						.getZ() >= lowestPoint.getZ())) {
			this.zeroPoint = zeroPoint;
		} else {
			throw new CoordinatesSystemDefinitionException(
					"wrong zero point coordinates definition");
		}
	}
}
