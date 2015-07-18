package ch.nuedling.grid.matrix;

import java.util.ArrayList;
import java.util.List;

import ch.nuedling.basics.Angles;

public class NodeRunner {
	private List<ExtendedNode> nodes = null;
	public NodeRunner() {
		nodes = new ArrayList<ExtendedNode>();
	}
	public List<ExtendedNode> run(Node startNode, Angles direction){
		
		List<ExtendedNode> selectedNodes = null;
		Node nextNode = startNode;
		if (nodes.size()==0){
			do{
				selectedNodes = null;
				
				selectedNodes = nextNode.getSpecificNeighboursInThisDirection(direction);
				
				
				if ((selectedNodes != null) && (selectedNodes.size()>0)){
					nodes.addAll(selectedNodes);
					nextNode = selectedNodes.get(0).getNode();
				}
			}while((selectedNodes != null) && (selectedNodes.size()>0) );
		}
		return nodes;
	}
}
