package ch.nuedling.grid.matrix;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ch.nuedling.basics.AngleDefinitionException;
import ch.nuedling.basics.Angles;
import ch.nuedling.basics.BasePoint;
import ch.nuedling.basics.CoordinatesSystemDefinition;
import ch.nuedling.basics.CoordinatesSystemDefinitionException;
import ch.nuedling.basics.Point;
import ch.nuedling.basics.PointDefinitionException;
import ch.nuedling.basics.PointPosition;
import ch.nuedling.grid.matrix.ExtendedNode;
import ch.nuedling.grid.matrix.Node;

public class TestNode {

	@Test
	public void node_BestNeighbourInThisDirection() {
		List<ExtendedNode> testNodes = new ArrayList<ExtendedNode>();
		List<Node> nodes = new ArrayList<Node>();
		CoordinatesSystemDefinition myCoordinatesSystemDefinition = null;
		Node me = null;
		try {
			myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(10, 10, 10), new BasePoint(0, 0, 0),
					new BasePoint(0, 0, 0));

			me = new Node(new PointPosition(new Point(0, 0, 0,
					myCoordinatesSystemDefinition)), nodes);

			Node node1 = null;
			node1 = new Node(new PointPosition(new Point(0, 0, 1,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node1);
			Node node2 = null;
			node2 = new Node(new PointPosition(new Point(0, 0, 2,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node2);
			Node node3 = null;
			node3 = new Node(new PointPosition(new Point(0, 0, 3,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node3);
			Node node4 = null;
			node4 = new Node(new PointPosition(new Point(0, 0, 4,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node4);
			Node node5 = null;
			node5 = new Node(new PointPosition(new Point(0, 0, 5,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node5);
			Node node6 = null;
			node6 = new Node(new PointPosition(new Point(0, 0, 6,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node6);
			Node node7 = null;
			node7 = new Node(new PointPosition(new Point(0, 0, 7,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node7);
			Node node8 = null;
			node8 = new Node(new PointPosition(new Point(0, 0, 8,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node8);
			Node node9 = null;
			node9 = new Node(new PointPosition(new Point(0, 0, 9,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node9);
			Node node10 = null;
			node10 = new Node(new PointPosition(new Point(0, 0, 10,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node10);
		} catch (PointDefinitionException
				| CoordinatesSystemDefinitionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Double delta;
		for (Node node : nodes) {
			if (!node.equals(me)) {
				delta = me.getPosition().getDistanceFromPoint(
						node.getPosition().getPoint());

				Angles angles = me.getPosition().getAnglesToPoint(
						node.getPosition().getPoint());

				testNodes.add(new ExtendedNode(node, angles, delta));
			}

		}
		Angles direction = null;
		try {
			direction = new Angles(90.0, 0);
		} catch (AngleDefinitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		ExtendedNode result = Node.findNodeWithBestDistanceAndAngles(testNodes, direction);

		assertEquals(result.getAngles().getAzimuth(), 0.0, 0);
		assertEquals(result.getAngles().getElevation(), 90.0, 0);
		assertEquals(result.getDistance(), 1, 0);

	}

	@Test
	public void node_BestNeighbourInThisDirectionWithWeighting() {
		List<ExtendedNode> testNodes = new ArrayList<ExtendedNode>();
		List<Node> nodes = new ArrayList<Node>();
		CoordinatesSystemDefinition myCoordinatesSystemDefinition = null;
		Node me = null;
		try {
			myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(10, 10, 10), new BasePoint(0, 0, 0),
					new BasePoint(0, 0, 0));

			me = new Node(new PointPosition(new Point(0, 0, 0,
					myCoordinatesSystemDefinition)), nodes);

			Node node1 = null;
			node1 = new Node(new PointPosition(new Point(0, 0, 1,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node1);
			Node node2 = null;
			node2 = new Node(new PointPosition(new Point(0, 0, 2,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node2);
			Node node3 = null;
			node3 = new Node(new PointPosition(new Point(0, 0, 3,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node3);
			Node node4 = null;
			node4 = new Node(new PointPosition(new Point(0, 0, 4,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node4);
			Node node5 = null;
			node5 = new Node(new PointPosition(new Point(0, 0, 5,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node5);
			Node node6 = null;
			node6 = new Node(new PointPosition(new Point(0, 0, 6,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node6);
			Node node7 = null;
			node7 = new Node(new PointPosition(new Point(0, 0, 7,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node7);
			Node node8 = null;
			node8 = new Node(new PointPosition(new Point(0, 0, 8,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node8);
			Node node9 = null;
			node9 = new Node(new PointPosition(new Point(0, 0, 9,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node9);
			Node node10 = null;
			node10 = new Node(new PointPosition(new Point(0, 0, 10,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node10);
		} catch (PointDefinitionException
				| CoordinatesSystemDefinitionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Double delta;
		for (Node node : nodes) {
			if (!node.equals(me)) {
				delta = me.getPosition().getDistanceFromPoint(
						node.getPosition().getPoint());

				Angles angles = me.getPosition().getAnglesToPoint(
						node.getPosition().getPoint());

				testNodes.add(new ExtendedNode(node, angles, delta));
			}

		}
		Angles direction = null;
		try {
			direction = new Angles(90.0, 0);
		} catch (AngleDefinitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		ExtendedNode result = Node.findNodeWithBestDistanceAndAngles(testNodes, direction);

		assertEquals(result.getNode().getPosition().getX(), 0, 0);
		assertEquals(result.getNode().getPosition().getY(), 0, 0);
		assertEquals(result.getNode().getPosition().getZ(), 1, 0);

	}
	@Test
	public void node_BestNeighbourInThisDirectionWithWeighting_distance() {
		List<ExtendedNode> testNodes = new ArrayList<ExtendedNode>();
		List<Node> nodes = new ArrayList<Node>();
		CoordinatesSystemDefinition myCoordinatesSystemDefinition = null;
		Node me = null;
		try {
			myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(1000, 1000, 1000), new BasePoint(-1000, -1000, -1000),
					new BasePoint(0, 0, 0));

			me = new Node(new PointPosition(new Point(0, 0, 0,
					myCoordinatesSystemDefinition)), nodes);

			Node node1 = null;
			node1 = new Node(new PointPosition(new Point(0, 1, 100,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node1);
			Node node2 = null;
			node2 = new Node(new PointPosition(new Point(0, 10, 100,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node2);
			Node node3 = null;
			node3 = new Node(new PointPosition(new Point(0, 20, 100,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node3);
			Node node4 = null;
			node4 = new Node(new PointPosition(new Point(0, 30, 100,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node4);
			Node node5 = null;
			node5 = new Node(new PointPosition(new Point(0, 0, 100,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node5);
			Node node6 = null;
			node6 = new Node(new PointPosition(new Point(0, 0, 100,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node6);
			Node node7 = null;
			node7 = new Node(new PointPosition(new Point(0, 0, 100,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node7);
			Node node8 = null;
			node8 = new Node(new PointPosition(new Point(0, 0, 100,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node8);
			Node node9 = null;
			node9 = new Node(new PointPosition(new Point(0, 0, 100,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node9);
			Node node10 = null;
			node10 = new Node(new PointPosition(new Point(0, 0, 100,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node10);
		} catch (PointDefinitionException
				| CoordinatesSystemDefinitionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Double delta;
		for (Node node : nodes) {
			if (!node.equals(me)) {
				delta = me.getPosition().getDistanceFromPoint(
						node.getPosition().getPoint());

				Angles angles = me.getPosition().getAnglesToPoint(
						node.getPosition().getPoint());

				testNodes.add(new ExtendedNode(node, angles, delta));
			}

		}
		Angles direction = null;
		try {
			direction = new Angles(35.0, 35.0);
		} catch (AngleDefinitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		ExtendedNode result = Node.findNodeWithBestDistanceAndAngles(testNodes, direction);

		assertEquals(result.getNode().getPosition().getX(), 10, 0);
		assertEquals(result.getNode().getPosition().getY(), 10, 0);
		assertEquals(result.getNode().getPosition().getZ(), 10, 0);

	}
	
	@Test
	public void node_BestNeighbourInThisDirectionWithWeighting_angles() {
		List<ExtendedNode> testNodes = new ArrayList<ExtendedNode>();
		List<Node> nodes = new ArrayList<Node>();
		CoordinatesSystemDefinition myCoordinatesSystemDefinition = null;
		Node me = null;
		try {
			myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(1000, 1000, 1000), new BasePoint(-1000, -1000, -1000),
					new BasePoint(0, 0, 0));

			me = new Node(new PointPosition(new Point(0, 0, 0,
					myCoordinatesSystemDefinition)), nodes);

			Node node1 = null;
			node1 = new Node(new PointPosition(new Point(100, 100, 100,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node1);
			Node node2 = null;
			node2 = new Node(new PointPosition(new Point(15, 1, 93,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node2);
			Node node3 = null;
			node3 = new Node(new PointPosition(new Point(1000, 1000, 1000,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node3);
			Node node4 = null;
			node4 = new Node(new PointPosition(new Point(101, 101, 101,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node4);
			Node node5 = null;
			node5 = new Node(new PointPosition(new Point(110, 110, 110,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node5);
			Node node6 = null;
			node6 = new Node(new PointPosition(new Point(111, 111, 111,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node6);
			Node node7 = null;
			node7 = new Node(new PointPosition(new Point(122, 122, 122,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node7);
			Node node8 = null;
			node8 = new Node(new PointPosition(new Point(133, 133, 133,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node8);
			Node node9 = null;
			node9 = new Node(new PointPosition(new Point(100, 100, 100,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node9);
			Node node10 = null;
			node10 = new Node(new PointPosition(new Point(100, 100, 100,
					myCoordinatesSystemDefinition)), nodes);
			nodes.add(node10);
		} catch (PointDefinitionException
				| CoordinatesSystemDefinitionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Double delta;
		for (Node node : nodes) {
			if (!node.equals(me)) {
				delta = me.getPosition().getDistanceFromPoint(
						node.getPosition().getPoint());

				Angles angles = me.getPosition().getAnglesToPoint(
						node.getPosition().getPoint());

				testNodes.add(new ExtendedNode(node, angles, delta));
			}

		}
		Angles direction = null;
		try {
			direction = new Angles(35.0, 35.0);
		} catch (AngleDefinitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		ExtendedNode result = Node.findNodeWithBestDistanceAndAngles(testNodes, direction);

		assertEquals(result.getNode().getPosition().getX(), 100, 0);
		assertEquals(result.getNode().getPosition().getY(), 100, 0);
		assertEquals(result.getNode().getPosition().getZ(), 100, 0);

	}
}
