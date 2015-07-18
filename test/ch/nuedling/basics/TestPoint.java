package ch.nuedling.basics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestPoint {

	@Test
	public void point__xP5_yP6_zP7() {
		//Boolean thrown = false;
		Integer xH = 10;
		Integer yH = 10;
		Integer zH = 10;

		Integer xL = -10;
		Integer yL = -10;
		Integer zL = -10;

		Integer xZ = 0;
		Integer yZ = 0;
		Integer zZ = 0;

		Integer xP = 5;
		Integer yP = 6;
		Integer zP = 7;

		try {
			CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
					new BasePoint(xZ, yZ, zZ));
			Point myPoint = new Point(xP, yP, zP, myCoordinatesSystemDefinition);

			assertEquals(xP, myPoint.getX(), 0);
			assertEquals(yP, myPoint.getY(), 0);
			assertEquals(zP, myPoint.getZ(), 0);
		} catch (CoordinatesSystemDefinitionException e) {
			e.printStackTrace();
		} catch (PointDefinitionException e) {
			//thrown = true;
			e.printStackTrace();
		}
		//assertTrue(thrown);
	}
	@Test
	public void point__xP10_yP10_zP10() {
		//Boolean thrown = false;
		Integer xH = 10;
		Integer yH = 10;
		Integer zH = 10;

		Integer xL = -10;
		Integer yL = -10;
		Integer zL = -10;

		Integer xZ = 0;
		Integer yZ = 0;
		Integer zZ = 0;

		Integer xP = 10;
		Integer yP = 10;
		Integer zP = 10;

		try {
			CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
					new BasePoint(xZ, yZ, zZ));
			Point myPoint = new Point(xP, yP, zP, myCoordinatesSystemDefinition);

			assertEquals(xP, myPoint.getX(), 0);
			assertEquals(yP, myPoint.getY(), 0);
			assertEquals(zP, myPoint.getZ(), 0);
		} catch (CoordinatesSystemDefinitionException e) {
			e.printStackTrace();
		} catch (PointDefinitionException e) {
			//thrown = true;
			//e.printStackTrace();
		}
		//assertTrue(thrown);
	}
	@Test
	public void point__xP10_yP10_zP11() {
		Boolean thrown = false;
		Integer xH = 10;
		Integer yH = 10;
		Integer zH = 10;

		Integer xL = -10;
		Integer yL = -10;
		Integer zL = -10;

		Integer xZ = 0;
		Integer yZ = 0;
		Integer zZ = 0;

		Integer xP = 10;
		Integer yP = 10;
		Integer zP = 11;

		try {
			CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
					new BasePoint(xZ, yZ, zZ));
			Point myPoint = new Point(xP, yP, zP, myCoordinatesSystemDefinition);

			assertEquals(xP, myPoint.getX(), 0);
			assertEquals(yP, myPoint.getY(), 0);
			assertEquals(zP, myPoint.getZ(), 0);
		} catch (CoordinatesSystemDefinitionException e) {
			e.printStackTrace();
		} catch (PointDefinitionException e) {
			thrown = true;
			//e.printStackTrace();
		}
		assertTrue(thrown);
	}
	@Test
	public void point___xP10__yP10__zP10() {
		//Boolean thrown = false;
		Integer xH = 10;
		Integer yH = 10;
		Integer zH = 10;

		Integer xL = -10;
		Integer yL = -10;
		Integer zL = -10;

		Integer xZ = 0;
		Integer yZ = 0;
		Integer zZ = 0;

		Integer xP = -10;
		Integer yP = -10;
		Integer zP = -10;

		try {
			CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
					new BasePoint(xZ, yZ, zZ));
			Point myPoint = new Point(xP, yP, zP, myCoordinatesSystemDefinition);

			assertEquals(xP, myPoint.getX(), 0);
			assertEquals(yP, myPoint.getY(), 0);
			assertEquals(zP, myPoint.getZ(), 0);
		} catch (CoordinatesSystemDefinitionException e) {
			e.printStackTrace();
		} catch (PointDefinitionException e) {
			//thrown = true;
			//e.printStackTrace();
		}
		//assertTrue(thrown);
	}
	@Test
	public void point___xP10__yP10__zP11() {
		Boolean thrown = false;
		Integer xH = 10;
		Integer yH = 10;
		Integer zH = 10;

		Integer xL = -10;
		Integer yL = -10;
		Integer zL = -10;

		Integer xZ = 0;
		Integer yZ = 0;
		Integer zZ = 0;

		Integer xP = -10;
		Integer yP = -10;
		Integer zP = -11;

		try {
			CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
					new BasePoint(xZ, yZ, zZ));
			Point myPoint = new Point(xP, yP, zP, myCoordinatesSystemDefinition);

			assertEquals(xP, myPoint.getX(), 0);
			assertEquals(yP, myPoint.getY(), 0);
			assertEquals(zP, myPoint.getZ(), 0);
		} catch (CoordinatesSystemDefinitionException e) {
			e.printStackTrace();
		} catch (PointDefinitionException e) {
			thrown = true;
			//e.printStackTrace();
		}
		assertTrue(thrown);
	}
	@Test
	public void point__xP0_yP0_zP0() {
		//Boolean thrown = false;
		Integer xH = 10;
		Integer yH = 10;
		Integer zH = 10;

		Integer xL = -10;
		Integer yL = -10;
		Integer zL = -10;

		Integer xZ = 0;
		Integer yZ = 0;
		Integer zZ = 0;

		Integer xP = 0;
		Integer yP = 0;
		Integer zP = 0;

		try {
			CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
					new BasePoint(xZ, yZ, zZ));
			Point myPoint = new Point(xP, yP, zP, myCoordinatesSystemDefinition);

			assertEquals(xP, myPoint.getX(), 0);
			assertEquals(yP, myPoint.getY(), 0);
			assertEquals(zP, myPoint.getZ(), 0);
		} catch (CoordinatesSystemDefinitionException e) {
			e.printStackTrace();
		} catch (PointDefinitionException e) {
			//thrown = true;
			//e.printStackTrace();
		}
		//assertTrue(thrown);
	}
}
