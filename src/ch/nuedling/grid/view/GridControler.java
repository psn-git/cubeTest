package ch.nuedling.grid.view;

import java.util.List;

import javax.media.opengl.GL2;

import ch.nuedling.basics.AngleDefinitionException;
import ch.nuedling.basics.Angles;
import ch.nuedling.grid.matrix.ExtendedNode;
import ch.nuedling.grid.matrix.Node;
import ch.nuedling.grid.matrix.NodeRunner;
import ch.nuedling.grid.matrix.Room;
import ch.nuedling.gui.DrawObject;
import ch.nuedling.gui.JOGLCube;

public class GridControler implements DrawObject {
	private Room room = null;
	private NodeRunner nodeRunner = null;
	public GridControler() {
		super();
		room = new Room();
		nodeRunner = new NodeRunner();
	}

	public void showCube() {

		JOGLCube cube = new JOGLCube();
		cube.startAnimation(this);
	}

	public static void main(String[] args) {
		new GridControler().showCube();

	}

	@Override
	public void draw(GL2 gl) {
	
		gl.glBegin(GL2.GL_POINTS);
		
		gl.glColor3ub((byte)255, (byte)0, (byte)0);
		Node selected = this.room.getNodes().get(100);
		gl.glVertex3i(selected.getPosition().getX(), selected.getPosition().getY(), selected.getPosition().getZ());
		
		
		gl.glColor3ub((byte)34, (byte)255, (byte)0);
		List<ExtendedNode> myNeighbours = selected.getAllNeighbours();
		
		for (ExtendedNode node : myNeighbours) {
			gl.glVertex3i(node.getNode().getPosition().getX(), node.getNode().getPosition().getY(), node.getNode().getPosition().getZ());
		}
		gl.glEnd();
		
		
		gl.glBegin(GL2.GL_POINTS);
		gl.glColor3ub((byte)0, (byte)0, (byte)0);
		try {
			
			List<ExtendedNode> nodes = nodeRunner.run(this.room.getNodes().get(100), new Angles(0.0, 0.0));
			for (ExtendedNode node: nodes){
				gl.glVertex3i(node.getNode().getPosition().getX(), node.getNode().getPosition().getY(), node.getNode().getPosition().getZ());
			}
		} catch (AngleDefinitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		gl.glEnd();

	}
	
}
