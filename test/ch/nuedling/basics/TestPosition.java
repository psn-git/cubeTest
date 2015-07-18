package ch.nuedling.basics;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPosition {

	@Test
	public void position__xP5_yP6_zP7_elevation5_0__azimuth6_0() throws AngleDefinitionException {
		Integer xH = 10;
		Integer yH = 10;
		Integer zH = 10;

		Integer xL = -10;
		Integer yL = -10;
		Integer zL = -10;

		Integer xZ = 1;
		Integer yZ = 2;
		Integer zZ = 3;

		Integer xP = 5;
		Integer yP = 6;
		Integer zP = 7;

		Double elevation = 215.2643;
		Double azimuth = 215.2643;
		Double distance = 6.9282;
		Point myPoint = null;
		try {
			CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
					new BasePoint(xZ, yZ, zZ));
			myPoint = new Point(xP, yP, zP, myCoordinatesSystemDefinition);
		} catch (CoordinatesSystemDefinitionException e) {
			e.printStackTrace();
		} catch (PointDefinitionException e) {
			e.printStackTrace();
		}
		PointPosition myPosition = new PointPosition(myPoint);

		assertEquals(xP, myPosition.getX(), 0);
		assertEquals(yP, myPosition.getY(), 0);
		assertEquals(zP, myPosition.getZ(), 0);
        assertEquals(distance, myPosition.getDistanceFromZero(), 0.0001);
		assertEquals(elevation, myPosition.getAnglesToZero().getElevation(), 0.0001);
		assertEquals(azimuth, myPosition.getAnglesToZero().getAzimuth(), 0.0001);
	}

	@Test
	public void position__xP0_yP0_zP7() {
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
		Integer zP = 7;

		Double elevation = 270.0;
		Double azimuth = 0.0;
		Double distanceToZero = 7.0;

		Point myPoint = null;
		try {
			CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
					new BasePoint(xZ, yZ, zZ));
			myPoint = new Point(xP, yP, zP, myCoordinatesSystemDefinition);
		} catch (CoordinatesSystemDefinitionException e) {
			e.printStackTrace();
		} catch (PointDefinitionException e) {
			e.printStackTrace();
		}
		PointPosition myPosition = null;
		myPosition = new PointPosition(myPoint);


		assertEquals(xP, myPosition.getX(), 0);
		assertEquals(yP, myPosition.getY(), 0);
		assertEquals(zP, myPosition.getZ(), 0);

        assertEquals(distanceToZero, myPosition.getDistanceFromZero(), 0.0001);
		assertEquals(elevation, myPosition.getAnglesToZero().getElevation(), 0.0001);
		assertEquals(azimuth, myPosition.getAnglesToZero().getAzimuth(), 0.0001);
			
	}

}
