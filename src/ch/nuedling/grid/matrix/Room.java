package ch.nuedling.grid.matrix;

import java.util.ArrayList;
import java.util.List;

import ch.nuedling.basics.BasePoint;
import ch.nuedling.basics.CoordinatesSystemDefinition;
import ch.nuedling.basics.CoordinatesSystemDefinitionException;
import ch.nuedling.basics.Point;
import ch.nuedling.basics.PointDefinitionException;
import ch.nuedling.basics.PointPosition;
import ch.nuedling.util.RandomGenerator;

public class Room {
	private List<Node> nodes;

	public Room() {
		final Integer MAX_DIMENSION = 1000;
		final Integer MIN_DIMENSION = -1000;
		final Integer NodeCount = Math.abs(MAX_DIMENSION)+Math.abs(MIN_DIMENSION)*6;
		final Integer ZERO_POINT = 0;
		
		nodes = new ArrayList<Node>();
		CoordinatesSystemDefinition myCoordinatesSystemDefinition= null;
		try {
			myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(MAX_DIMENSION, MAX_DIMENSION, MAX_DIMENSION), new BasePoint(MIN_DIMENSION, MIN_DIMENSION,
							MIN_DIMENSION), new BasePoint(ZERO_POINT, ZERO_POINT, ZERO_POINT));
		} catch (CoordinatesSystemDefinitionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		RandomGenerator generator = new RandomGenerator(MAX_DIMENSION, MIN_DIMENSION);

		Point myPoint = null;
		PointPosition myPosition = null;
		Node myNode = null;
		
		for (Integer counter = 0; counter < NodeCount; counter++) {
			try {
				myPoint = new Point(generator.getInteger(),
						generator.getInteger(), generator.getInteger(),
						myCoordinatesSystemDefinition);
				myPosition = new PointPosition(myPoint);
				myNode = new Node(myPosition, nodes);
				
			} catch (PointDefinitionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			nodes.add(myNode);
		}
		
		for (Node node : nodes){
			node.findNeighbours();
		}

	}
	
	public List<Node> getNodes(){
		return this.nodes;
	}
}
