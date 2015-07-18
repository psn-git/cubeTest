package ch.nuedling.gui;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.Method;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.fixedfunc.GLMatrixFunc;
import javax.media.opengl.glu.GLU;

import com.jogamp.opengl.util.Animator;

public class JOGLCube implements GLEventListener {
	private static Double rotateT = 0.0;
	private DrawObject drawObject = null;
	private static final Integer dimensions = 1000, cx = 1 * dimensions,
			cy = 1 * dimensions, cz = 1 * dimensions;

	@Override
	public void display(GLAutoDrawable gLDrawable) {
		final GL2 gl = gLDrawable.getGL().getGL2();
		final GLU glu = new GLU();

		gl.glClear(GL.GL_COLOR_BUFFER_BIT);
		gl.glLoadIdentity();
		glu.gluLookAt(0 * cx, 12 * cy, 28 * cz, 0 * cx, 0 * cy, 0 * cz, 0 * cx,
				1 * cy, 0 * cz);

		drawField(gl, glu);
	}

	@Override
	public void init(GLAutoDrawable glDrawable) {
		GL2 gl = glDrawable.getGL().getGL2();
		final GLU glu = new GLU();
		gl.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
		setCamera(gl, glu);
		gl.glMatrixMode(GLMatrixFunc.GL_MODELVIEW);
	}

	private void setCamera(GL2 gl, GLU glu) {
		gl.glMatrixMode(GLMatrixFunc.GL_PROJECTION);
		gl.glLoadIdentity();
		final Double fovy = 8.0;
		glu.gluPerspective(fovy, 1, 10.0 * dimensions, 40.0 * dimensions);
	}

	public void drawField(GL2 gl, GLU glu) {
		// rotate about the three axis
		// gl.glRotated(rotateT, 1, 0, 0);// x
		gl.glRotated(rotateT, 0, 1, 0);// y
		// gl.glRotated(rotateT, 0, 0, 1);// z

		// Cube
		gl.glBegin(GL2.GL_QUADS);
		gl.glColor3ub((byte)240, (byte)255, (byte)255);
		// Front Side
		gl.glVertex3i(-1 * cx, -1 * cy, 1 * cz);
		gl.glVertex3i(1 * cx, -1 * cy, 1 * cz);
		gl.glVertex3i(1 * cx, 1 * cy, 1 * cz);
		gl.glVertex3i(-1 * cx, 1 * cy, 1 * cz);
		// Back Side
		gl.glVertex3i(1 * cx, -1 * cy, -1 * cz);
		gl.glVertex3i(-1 * cx, -1 * cy, -1 * cz);
		gl.glVertex3i(-1 * cx, 1 * cy, -1 * cz);
		gl.glVertex3i(1 * cx, 1 * cy, -1 * cz);
		// Left Side
		gl.glVertex3i(-1 * cx, -1 * cy, -1 * cz);
		gl.glVertex3i(-1 * cx, -1 * cy, 1 * cz);
		gl.glVertex3i(-1 * cx, 1 * cy, 1 * cz);
		gl.glVertex3i(-1 * cx, 1 * cy, -1 * cz);
		// Right Side
		gl.glVertex3i(1 * cx, -1 * cy, 1 * cz);
		gl.glVertex3i(1 * cx, -1 * cy, -1 * cz);
		gl.glVertex3i(1 * cx, 1 * cy, -1 * cz);
		gl.glVertex3i(1 * cx, 1 * cy, 1 * cz);
		// Top Side
		// gl.glVertex3i(-1,1,1);
		// gl.glVertex3i(1,1,1);
		// gl.glVertex3i(1,1,-1);
		// gl.glVertex3i(-1,1,-1);
		// Bottom Side
		gl.glVertex3i(1 * cx, -1 * cy, -1 * cz);
		gl.glVertex3i(-1 * cx, -1 * cy, -1 * cz);
		gl.glVertex3i(-1 * cx, -1 * cy, 1 * cz);
		gl.glVertex3i(1 * cx, -1 * cy, 1 * cz);
		gl.glEnd();

		// Grid
		gl.glBegin(GL2.GL_LINES);
		gl.glColor3ub((byte)122, (byte)122, (byte)122);

		// Front Side
		gl.glVertex3i(-1 * cx, -1 * cy, 1 * cz);
		gl.glVertex3i(1 * cx, -1 * cy, 1 * cz);
		gl.glVertex3i(-1 * cx, -1 * cy, 1 * cz);
		gl.glVertex3i(-1 * cx, 1 * cy, 1 * cz);
		gl.glVertex3i(-1 * cx, 1 * cy, 1 * cz);
		gl.glVertex3i(1 * cx, 1 * cy, 1 * cz);
		gl.glVertex3i(1 * cx, 1 * cy, 1 * cz);
		gl.glVertex3i(1 * cx, -1 * cy, 1 * cz);

		// Back Side
		gl.glVertex3i(-1 * cx, -1 * cy, -1 * cz);
		gl.glVertex3i(1 * cx, -1 * cy, -1 * cz);
		gl.glVertex3i(-1 * cx, -1 * cy, -1 * cz);
		gl.glVertex3i(-1 * cx, 1 * cy, -1 * cz);
		gl.glVertex3i(-1 * cx, 1 * cy, -1 * cz);
		gl.glVertex3i(1 * cx, 1 * cy, -1 * cz);
		gl.glVertex3i(1 * cx, 1 * cy, -1 * cz);
		gl.glVertex3i(1 * cx, -1 * cy, -1 * cz);

		// Connect Sides
		gl.glVertex3i(-1 * cx, -1 * cy, 1 * cz);
		gl.glVertex3i(-1 * cx, -1 * cy, -1 * cz);
		gl.glVertex3i(1 * cx, -1 * cy, 1 * cz);
		gl.glVertex3i(1 * cx, -1 * cy, -1 * cz);
		gl.glVertex3i(-1 * cx, 1 * cy, 1 * cz);
		gl.glVertex3i(-1 * cx, 1 * cy, -1 * cz);
		gl.glVertex3i(1 * cx, 1 * cy, 1 * cz);
		gl.glVertex3i(1 * cx, 1 * cy, -1 * cz);

		gl.glEnd();

		// axis cross
		gl.glBegin(GL2.GL_LINES);

		gl.glColor3ub((byte)255, (byte)0, (byte)0); // red y
		gl.glVertex3i(-0 * cx, 0 * cy, 1 * cz);
		gl.glVertex3i(-0 * cx, 0 * cy, -1 * cz);

		gl.glColor3ub((byte)0, (byte)0, (byte)255); // blue x
		gl.glVertex3i(1 * cx, 0 * cy, 0 * cz);
		gl.glVertex3i(-1 * cx, 0 * cy, 0 * cz);

		gl.glColor3ub((byte)34, (byte)255, (byte)0); // green z
		gl.glVertex3i(0 * cx, 1 * cy, 0 * cz);
		gl.glVertex3i(0 * cx, -1 * cy, 0 * cz);

		gl.glEnd();
		if (drawObject != null){
			drawObject.draw(gl);
		}
		rotateT += 0.1;
	}

	@Override
	public void dispose(GLAutoDrawable gLDrawable) {

	}
	public void startAnimation(DrawObject controler){
		this.drawObject = controler;
		final GLCanvas canvas = new GLCanvas();
		final Frame frame = new Frame("Jogl Quad drawing");
		final Animator animator = new Animator(canvas);
		canvas.addGLEventListener(this);
		frame.add(canvas);
		
		
		
		frame.setSize(940, 680);
		frame.setResizable(false);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				animator.stop();
				frame.dispose();
				//System.exit(0);
			}
		});
		frame.setVisible(true);
		animator.start();
		canvas.requestFocus();

	}
	
	public static void main(String[] args) {
		new JOGLCube().startAnimation(null);
			}

	@Override
	public void reshape(GLAutoDrawable gl, int x, int y, int w, int h) {
	}
	
	public void callbackObjectDraw(Method drawThis ){
		
	}

}
