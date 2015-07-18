package ch.nuedling.basics;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCoordinatesSystemDefinition {
	@Test
	public void coordinatesSystemDefinition_H10__L10_Z0() {
		Integer xH = 10;
		Integer yH = 11;
		Integer zH = 12;

		Integer xL = -10;
		Integer yL = -11;
		Integer zL = -12;

		Integer xZ = 0;
		Integer yZ = 0;
		Integer zZ = 0;

		try {
			CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
					new BasePoint(xZ, yZ, zZ));
			
			assertEquals(xH, myCoordinatesSystemDefinition.getHighestPoint().getX(), 0);
			assertEquals(yH, myCoordinatesSystemDefinition.getHighestPoint().getY(), 0);
			assertEquals(zH, myCoordinatesSystemDefinition.getHighestPoint().getZ(), 0);

			assertEquals(xL, myCoordinatesSystemDefinition.getLowestPoint().getX(), 0);
			assertEquals(yL, myCoordinatesSystemDefinition.getLowestPoint().getY(), 0);
			assertEquals(zL, myCoordinatesSystemDefinition.getLowestPoint().getZ(), 0);

			
			assertEquals(xZ, myCoordinatesSystemDefinition.getZeroPoint().getX(), 0);
			assertEquals(yZ, myCoordinatesSystemDefinition.getZeroPoint().getY(), 0);
			assertEquals(zZ, myCoordinatesSystemDefinition.getZeroPoint().getZ(), 0);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void coordinatesSystemDefinition_H10_L10_Z0() {
		Boolean thrown = false;
		Integer xH = 10;
		Integer yH = 11;
		Integer zH = 12;

		Integer xL = 10;
		Integer yL = 11;
		Integer zL = 12;

		Integer xZ = 0;
		Integer yZ = 0;
		Integer zZ = 0;

		try {
			CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
					new BasePoint(xZ, yZ, zZ));
			


		} catch (CoordinatesSystemDefinitionException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	@Test
	public void coordinatesSystemDefinition_H10__xL10_yL10__zL10_Z0() {
		Boolean thrown = false;
		Integer xH = 10;
		Integer yH = 11;
		Integer zH = 12;

		Integer xL = -10;
		Integer yL =  11;
		Integer zL = -12;

		Integer xZ = 0;
		Integer yZ = 0;
		Integer zZ = 0;

		try {
			CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
					new BasePoint(xZ, yZ, zZ));
			


		} catch (CoordinatesSystemDefinitionException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	@Test
	public void coordinatesSystemDefinition_H10__xL10__yL10_zL10_Z0() {
		Boolean thrown = false;
		Integer xH = 10;
		Integer yH = 11;
		Integer zH = 12;

		Integer xL = -10;
		Integer yL = -11;
		Integer zL =  12;

		Integer xZ = 0;
		Integer yZ = 0;
		Integer zZ = 0;

		try {
			CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
					new BasePoint(xZ, yZ, zZ));
			


		} catch (CoordinatesSystemDefinitionException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	@Test
	public void coordinatesSystemDefinition__xH10_yH10_zH10__L10_Z0() {
		Boolean thrown = false;
		Integer xH = -10;
		Integer yH = 11;
		Integer zH = 12;

		Integer xL = -10;
		Integer yL = -11;
		Integer zL = -12;

		Integer xZ = 0;
		Integer yZ = 0;
		Integer zZ = 0;

		try {
			CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
					new BasePoint(xZ, yZ, zZ));
			


		} catch (CoordinatesSystemDefinitionException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	@Test
	public void coordinatesSystemDefinition_xH10__yH10_zH10__L10_Z0() {
		Boolean thrown = false;
		Integer xH = 10;
		Integer yH = -11;
		Integer zH = 12;

		Integer xL = -10;
		Integer yL = -11;
		Integer zL = -12;

		Integer xZ = 0;
		Integer yZ = 0;
		Integer zZ = 0;

		try {
			CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
					new BasePoint(xZ, yZ, zZ));
			


		} catch (CoordinatesSystemDefinitionException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	@Test
	public void coordinatesSystemDefinition_xH10_yH10__zH10__L10_Z0() {
		Boolean thrown = false;
		Integer xH = 10;
		Integer yH = 11;
		Integer zH = -12;

		Integer xL = -10;
		Integer yL = -11;
		Integer zL = -12;

		Integer xZ = 0;
		Integer yZ = 0;
		Integer zZ = 0;

		try {
			CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
					new BasePoint(xZ, yZ, zZ));
			


		} catch (CoordinatesSystemDefinitionException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	@Test
	public void coordinatesSystemDefinition_H10__L10_xZ10_yZ0_z0() {
		Boolean thrown = false;
		Integer xH = 10;
		Integer yH = 11;
		Integer zH = 12;

		Integer xL = -10;
		Integer yL = -11;
		Integer zL = -12;

		Integer xZ = 11;
		Integer yZ = 0;
		Integer zZ = 0;


			try {
				CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
						new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
						new BasePoint(xZ, yZ, zZ));
			} catch (CoordinatesSystemDefinitionException e) {

				thrown = true;
			}
	



		assertTrue(thrown);
	}
	@Test
	public void coordinatesSystemDefinition_H10__L10_xZ0_yZ10_z0() {
		Boolean thrown = false;
		Integer xH = 10;
		Integer yH = 11;
		Integer zH = 12;

		Integer xL = -10;
		Integer yL = -11;
		Integer zL = -12;

		Integer xZ = 0;
		Integer yZ = 12;
		Integer zZ = 0;


			try {
				CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
						new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
						new BasePoint(xZ, yZ, zZ));
			} catch (CoordinatesSystemDefinitionException e) {

				thrown = true;
			}
	



		assertTrue(thrown);
	}
	@Test
	public void coordinatesSystemDefinition_H10__L10_xZ0_yZ0_z10() {
		Boolean thrown = false;
		Integer xH = 10;
		Integer yH = 11;
		Integer zH = 12;

		Integer xL = -10;
		Integer yL = -11;
		Integer zL = -12;

		Integer xZ = 0;
		Integer yZ = 0;
		Integer zZ = 13;


			try {
				CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
						new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
						new BasePoint(xZ, yZ, zZ));
			} catch (CoordinatesSystemDefinitionException e) {

				thrown = true;
			}
	



		assertTrue(thrown);
	}
	@Test
	public void coordinatesSystemDefinition_H10__L10__xZ10_yZ0_z0() {
		Boolean thrown = false;
		Integer xH = 10;
		Integer yH = 11;
		Integer zH = 12;

		Integer xL = -10;
		Integer yL = -11;
		Integer zL = -12;

		Integer xZ = -11;
		Integer yZ = 0;
		Integer zZ = 0;


			try {
				CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
						new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
						new BasePoint(xZ, yZ, zZ));
			} catch (CoordinatesSystemDefinitionException e) {

				thrown = true;
			}
	



		assertTrue(thrown);
	}
	@Test
	public void coordinatesSystemDefinition_H10__L10_xZ0__yZ10_z0() {
		Boolean thrown = false;
		Integer xH = 10;
		Integer yH = 11;
		Integer zH = 12;

		Integer xL = -10;
		Integer yL = -11;
		Integer zL = -12;

		Integer xZ = 0;
		Integer yZ = -12;
		Integer zZ = 0;


			try {
				CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
						new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
						new BasePoint(xZ, yZ, zZ));
			} catch (CoordinatesSystemDefinitionException e) {

				thrown = true;
			}
	



		assertTrue(thrown);
	}
	@Test
	public void coordinatesSystemDefinition_H10__L10_xZ0_yZ0__z10() {
		Boolean thrown = false;
		Integer xH = 10;
		Integer yH = 11;
		Integer zH = 12;

		Integer xL = -10;
		Integer yL = -11;
		Integer zL = -12;

		Integer xZ = 0;
		Integer yZ = 0;
		Integer zZ = -13;


			try {
				CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
						new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
						new BasePoint(xZ, yZ, zZ));
			} catch (CoordinatesSystemDefinitionException e) {

				thrown = true;
			}
	



		assertTrue(thrown);
	}
}
