package ch.nuedling.basics;

public class Point extends BasePoint {
	private CoordinatesSystemDefinition coordinatesSystemDefinition;
    public Point(BasePoint bPoint, CoordinatesSystemDefinition coordinatesSystemDefinition) throws PointDefinitionException {
      this(bPoint.getX(), bPoint.getY(), bPoint.getZ(), coordinatesSystemDefinition); 	
    }
    
	public Point(Integer x, Integer y, Integer z,
			CoordinatesSystemDefinition coordinatesSystemDefinition)
			throws PointDefinitionException {
		super(x, y, z);
		this.coordinatesSystemDefinition = coordinatesSystemDefinition;
		if ((this.coordinatesSystemDefinition.getHighestPoint().getX() >= this
				.getX()
				&& this.coordinatesSystemDefinition.getHighestPoint().getY() >= this
						.getY() && this.coordinatesSystemDefinition
				.getHighestPoint().getZ() >= this.getZ())

				&& (this.coordinatesSystemDefinition.getLowestPoint().getX() <= this
						.getX()
						&& this.coordinatesSystemDefinition.getLowestPoint()
								.getY() <= this.getY() && this.coordinatesSystemDefinition
						.getLowestPoint().getZ() <= this.getZ())) {

			this.coordinatesSystemDefinition = coordinatesSystemDefinition;
		} else {

			throw new PointDefinitionException(
					String.format(
							"with points: x= %d, y= %d, z= %d and coordinates high definition: x= %d, y= %d, z= %d or coordinates low definition: x= %d, y= %d, z= %d ",
							this.getX(),
							this.getY(),
							this.getZ(),
							coordinatesSystemDefinition.getHighestPoint()
									.getX(),
							coordinatesSystemDefinition.getHighestPoint()
									.getY(),
							coordinatesSystemDefinition.getHighestPoint()
									.getZ(),
							coordinatesSystemDefinition.getLowestPoint().getX(),
							coordinatesSystemDefinition.getLowestPoint().getY(),
							coordinatesSystemDefinition.getLowestPoint().getZ()));
		}
	}

	public CoordinatesSystemDefinition getCoordinatesSystemDefinition() {
		return coordinatesSystemDefinition;
	}
	
	public static PointToPointDistance calculateAbsoluteCoordinatesDifferences(Point point1, Point point2) throws CoordinatesSystemDefinitionException {
		if (!point1.getCoordinatesSystemDefinition().equals(point2.getCoordinatesSystemDefinition())){
			throw new CoordinatesSystemDefinitionException(
					"different coordinates system definition");
		}
		PointToPointDistance distance = new PointToPointDistance();
		distance.setDeltaX(DistanceCalculator.calculateAbsoluteDifference(point1.getX(), point2.getX()));
		distance.setDeltaY(DistanceCalculator.calculateAbsoluteDifference(point1.getY(), point2.getY()));
		distance.setDeltaZ(DistanceCalculator.calculateAbsoluteDifference(point1.getZ(), point2.getZ()));
		return distance;
	}
	
	public static PointToPointDistance calculateCoordinatesDifferences(Point point1, Point point2) throws CoordinatesSystemDefinitionException {
		if (!point1.getCoordinatesSystemDefinition().equals(point2.getCoordinatesSystemDefinition())){
			throw new CoordinatesSystemDefinitionException(
					"different coordinates system definition");
		}
		PointToPointDistance distance = new PointToPointDistance();
		distance.setDeltaX(point2.getX()- point1.getX());
		distance.setDeltaY(point2.getY()- point1.getY());
		distance.setDeltaZ(point2.getZ()- point1.getZ());
		return distance;
	}
	

	
	
}