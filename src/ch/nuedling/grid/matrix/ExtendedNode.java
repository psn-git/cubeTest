package ch.nuedling.grid.matrix;

import ch.nuedling.basics.Angles;

public class ExtendedNode{
private Node node = null;
private Angles angles = null;
private Double distance = 0.0;
	public ExtendedNode(Node node, Angles angles, Double distance) {
		this.angles = angles;
		this.distance = distance;
		this.node = node;
	}
public Node getNode(){
	return this.node;
}

public Angles getAngles(){
	return this.angles;
}

public Double getDistance(){
	return this.distance;
}

}

