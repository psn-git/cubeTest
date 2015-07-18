package ch.nuedling.grid.matrix;

import java.util.ArrayList;
import java.util.List;

import ch.nuedling.basics.Angles;
import ch.nuedling.basics.PointPosition;

public class Node {
	private PointPosition position = null;
	private List<Node> nodeList = null;
	private List<ExtendedNode> neighbours = null;
	private static final Double MAX_DISTANCE_TO_NEIGHBOUR = 350.0;
	private static final Double MAX_TOLERANCE_NODE_DIRECTION = 30.0;

	public Node(PointPosition position, List<Node> nodeList) {
		this.position = position;
		this.nodeList = nodeList;
		this.neighbours = new ArrayList<ExtendedNode>();
	}

	public PointPosition getPosition() {
		return this.position;
	}

	public void findNeighbours() {
		Double delta = 0.0;
		for (Node node : this.nodeList) {
			if (node != this) {
				delta = node.getPosition().getDistanceFromPoint(
						this.getPosition().getPoint());
				if ((delta > 0.0) && (delta < MAX_DISTANCE_TO_NEIGHBOUR)) {
					Angles angles = this.getPosition().getAnglesToPoint(
							node.getPosition().getPoint());
					neighbours.add(new ExtendedNode(node, angles, delta));
				}
			}
		}
		// System.out.println(neighbours.size());
	}

	public List<ExtendedNode> getAllNeighbours() {
		return this.neighbours;
	}

	private List<ExtendedNode> findeNodesInThisDirection(Angles angles) {
		List<ExtendedNode> resultNodes = new ArrayList<ExtendedNode>();
		for (ExtendedNode node : this.neighbours) {

			if (Angles.isAngleInRangeAndTolerance(node.getAngles(), angles,
					MAX_TOLERANCE_NODE_DIRECTION)) {
				resultNodes.add(node);
			}
		}

		return resultNodes;
	}

	public static ExtendedNode findNodeWithBestDistanceAndAngles(List<ExtendedNode> nodes, Angles direction) {
		Double myDistance = 0.0;
		Double minDistance = 300.0+1;
		final Double MAX_WEIGHT = minDistance;
		ExtendedNode resultNode = null;

		for (ExtendedNode node : nodes) {

			myDistance = node.getDistance()* 1/MAX_DISTANCE_TO_NEIGHBOUR*100;
			myDistance += node.getAngles().getWeight(direction, MAX_TOLERANCE_NODE_DIRECTION);
			if (myDistance > MAX_WEIGHT-1){
				return null;
			}
			if (myDistance < minDistance) {
				minDistance = myDistance;
				resultNode = node;
			}

		}

		if (minDistance < MAX_WEIGHT) {
			return resultNode;
		} else {
			return null;
		}

	}

	public List<ExtendedNode> getSpecificNeighboursInThisDirection(Angles angles) {
		List<ExtendedNode> selectedNodes = findeNodesInThisDirection(angles);
		List<ExtendedNode> resultNodes = null;

		if ((selectedNodes != null) && (selectedNodes.size() > 0)) {
			ExtendedNode resultNode = findNodeWithBestDistanceAndAngles(selectedNodes, angles);
			if (resultNode != null) {
				resultNodes = new ArrayList<ExtendedNode>();
				resultNodes.add(resultNode);
			}
		}

		return resultNodes;
	}
}
