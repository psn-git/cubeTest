package ch.nuedling.basics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestAngles {

	@Test
	public void angle__elevation_5_azimuth_6() {
		// Boolean thrown = false;
		Double elevation = 5.0;
		Double azimuth = 6.0;

		Angles myAngles = null;
		try {
			myAngles = new Angles(elevation, azimuth);
			assertEquals(elevation, myAngles.getElevation(), 0);
			assertEquals(azimuth, myAngles.getAzimuth(), 0);
		} catch (AngleDefinitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// assertTrue(thrown);
	}

	@Test
	public void angle__elevation_0_azimuth_0() {
		// Boolean thrown = false;
		Double elevation = 0.0;
		Double azimuth = 0.0;

		Angles myAngles = null;
		try {
			myAngles = new Angles(elevation, azimuth);
			assertEquals(elevation, myAngles.getElevation(), 0);
			assertEquals(azimuth, myAngles.getAzimuth(), 0);
		} catch (AngleDefinitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// assertTrue(thrown);
	}

	@Test
	public void angle__elevation__1_azimuth_0() {
		Boolean thrown = false;
		Double elevation = -1.0;
		Double azimuth = 0.0;

		Angles myAngles = null;
		try {
			myAngles = new Angles(elevation, azimuth);
			assertEquals(elevation, myAngles.getElevation(), 0);
			assertEquals(azimuth, myAngles.getAzimuth(), 0);
		} catch (AngleDefinitionException e) {
			thrown = true;
			// e.printStackTrace();
		}

		assertTrue(thrown);
	}

	@Test
	public void angle__elevation__1_azimuth__1() {
		Boolean thrown = false;
		Double elevation = -1.0;
		Double azimuth = -1.0;

		Angles myAngles = null;
		try {
			myAngles = new Angles(elevation, azimuth);
			assertEquals(elevation, myAngles.getElevation(), 0);
			assertEquals(azimuth, myAngles.getAzimuth(), 0);
		} catch (AngleDefinitionException e) {
			thrown = true;
			// e.printStackTrace();
		}

		assertTrue(thrown);
	}

	@Test
	public void angle__elevation_360_azimuth_360() {
		Boolean thrown = false;
		Double elevation = 360.0;
		Double azimuth = 360.0;

		Angles myAngles = null;
		try {
			myAngles = new Angles(elevation, azimuth);
			assertEquals(elevation, myAngles.getElevation(), 0);
			assertEquals(azimuth, myAngles.getAzimuth(), 0);
		} catch (AngleDefinitionException e) {
			thrown = true;
			// e.printStackTrace();
		}

		assertTrue(thrown);
	}

	@Test
	public void angle__elevation_361_azimuth_361() {
		Boolean thrown = false;
		Double elevation = 361.0;
		Double azimuth = 361.0;

		Angles myAngles = null;
		try {
			myAngles = new Angles(elevation, azimuth);
			assertEquals(elevation, myAngles.getElevation(), 0);
			assertEquals(azimuth, myAngles.getAzimuth(), 0);
		} catch (AngleDefinitionException e) {
			thrown = true;
			// e.printStackTrace();
		}

		assertTrue(thrown);
	}

	@Test
	public void isAngleInRangeAndTolerance_zero_tolerance() {
		Double elevation = 0.0;
		Double azimuth = 1.0;
		Double dElevation = 0.0;
		Double dAzimuth = 1.0;
		Double tolerance = 0.0;

		Angles myAngles, direction = null;
		try {
			myAngles = new Angles(elevation, azimuth);
			direction = new Angles(dElevation, dAzimuth);

			assertTrue(Angles.isAngleInRangeAndTolerance(myAngles, direction,
					tolerance));

		} catch (AngleDefinitionException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void isAngleInRangeAndTolerance_10_tolerance_Elevation() {
		Double elevation = 1.1;
		Double azimuth = 0.0;
		Double dElevation = 1.0;
		Double dAzimuth = 0.0;
		Double tolerance = 10.0;

		Angles myAngles, direction = null;
		try {
			myAngles = new Angles(elevation, azimuth);
			direction = new Angles(dElevation, dAzimuth);

			assertTrue(Angles.isAngleInRangeAndTolerance(myAngles, direction,
					tolerance));

		} catch (AngleDefinitionException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void isAngleInRangeAndTolerance_10_tolerance_Elevation_Failed() {
		Double elevation = 1.2;
		Double azimuth = 0.0;
		Double dElevation = 1.0;
		Double dAzimuth = 0.0;
		Double tolerance = 10.0;

		Angles myAngles, direction = null;
		try {
			myAngles = new Angles(elevation, azimuth);
			direction = new Angles(dElevation, dAzimuth);

			assertFalse(Angles.isAngleInRangeAndTolerance(myAngles, direction,
					tolerance));

		} catch (AngleDefinitionException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void isAngleInRangeAndTolerance_10_tolerance_Elevation_zeroValue() {
		Double elevation = 0.1;
		Double azimuth = 0.0;
		Double dElevation = 0.0;
		Double dAzimuth = 0.0;
		Double tolerance = 10.0;

		Angles myAngles, direction = null;
		try {
			myAngles = new Angles(elevation, azimuth);
			direction = new Angles(dElevation, dAzimuth);

			assertTrue(Angles.isAngleInRangeAndTolerance(myAngles, direction,
					tolerance));

		} catch (AngleDefinitionException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void isAngleInRangeAndTolerance_10_tolerance_Elevation_zeroValue_Failed() {
		Double elevation = 5.1;
		Double azimuth = 0.0;
		Double dElevation = 0.0;
		Double dAzimuth = 0.0;
		Double tolerance = 10.0;

		Angles myAngles, direction = null;
		try {
			myAngles = new Angles(elevation, azimuth);
			direction = new Angles(dElevation, dAzimuth);

			assertFalse(Angles.isAngleInRangeAndTolerance(myAngles, direction,
					tolerance));

		} catch (AngleDefinitionException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void isAngleInRangeAndTolerance_10_tolerance_Elevation_zeroValue2() {
		Double elevation = 359.9;
		Double azimuth = 0.0;
		Double dElevation = 0.0;
		Double dAzimuth = 0.0;
		Double tolerance = 10.0;

		Angles myAngles, direction = null;
		try {
			myAngles = new Angles(elevation, azimuth);
			direction = new Angles(dElevation, dAzimuth);

			assertTrue(Angles.isAngleInRangeAndTolerance(myAngles, direction,
					tolerance));

		} catch (AngleDefinitionException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void isAngleInRangeAndTolerance_10_tolerance_Elevation_zeroValue2_Failed() {
		Double elevation = 354.9;
		Double azimuth = 0.0;
		Double dElevation = 0.0;
		Double dAzimuth = 0.0;
		Double tolerance = 10.0;

		Angles myAngles, direction = null;
		try {
			myAngles = new Angles(elevation, azimuth);
			direction = new Angles(dElevation, dAzimuth);

			assertFalse(Angles.isAngleInRangeAndTolerance(myAngles, direction,
					tolerance));

		} catch (AngleDefinitionException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void getWeight_ok() {
		Angles angles1, angles2;
		Double testValue1, testValue2;
		try {
			angles1 = new Angles(10.0, 11.0);
			angles2 = new Angles(15.0, 16.0);
			testValue1 = angles1.getWeight(angles2, 5.0);

			testValue2 = angles2.getWeight(angles1, 5.0);
			assertTrue(testValue1.equals(testValue2));
			assertTrue(Math.round(testValue1) == 100);

			angles1 = new Angles(15.0, 16.0);
			angles2 = new Angles(10.0, 11.0);
			testValue1 = angles1.getWeight(angles2, 5.0);
			assertTrue((Math.round(testValue1) == 100));

			testValue2 = angles2.getWeight(angles1, 5.0);
			assertTrue(testValue1.equals(testValue2));

			angles1 = new Angles(15.0, 16.0);
			angles2 = new Angles(15.0, 16.0);
			testValue1 = angles1.getWeight(angles2, 0.0);

			testValue2 = angles2.getWeight(angles1, 0.0);
			assertTrue(testValue1.equals(testValue2));
			assertTrue(testValue1.equals(0.0));

		} catch (AngleDefinitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void getDifferenceBetweenDirectionAndAngle() {
		Double difference = 0.0;
		difference = Angles.getDifferenceBetweenDirectionAndAngle(0.0, 358.0);
		assertEquals(2.0, difference, 0);

		difference = Angles.getDifferenceBetweenDirectionAndAngle(0.0, 2.0);
		assertEquals(2.0, difference, 0);

		difference = Angles.getDifferenceBetweenDirectionAndAngle(2.0, 0.0);
		assertEquals(2.0, difference, 0);

		difference = Angles.getDifferenceBetweenDirectionAndAngle(0.0, 0.0);
		assertEquals(0.0, difference, 0);

		difference = Angles.getDifferenceBetweenDirectionAndAngle(358.0, 0.0);
		assertEquals(2.0, difference, 0);

		difference = Angles.getDifferenceBetweenDirectionAndAngle(0.0, 2.0);
		assertEquals(2.0, difference, 0);

		difference = Angles.getDifferenceBetweenDirectionAndAngle(358.0, 358.0);
		assertEquals(0.0, difference, 0);

		difference = Angles.getDifferenceBetweenDirectionAndAngle(95.0, 97.0);
		assertEquals(2.0, difference, 0);

		difference = Angles.getDifferenceBetweenDirectionAndAngle(97.0, 95.0);
		assertEquals(2.0, difference, 0);

		difference = Angles.getDifferenceBetweenDirectionAndAngle(350.0, 359.0);
		assertEquals(9.0, difference, 0);

		difference = Angles.getDifferenceBetweenDirectionAndAngle(1.0, 1.0);
		assertEquals(0.0, difference, 0);

	}

	@Test
	public void isValueInTorerance_critical_angles() {
		Boolean result = false;
		result = Angles.isValueInTorerance(90.0, 90.0, 10.0);
		assertTrue(result);

		result = Angles.isValueInTorerance(100.0, 90.0, 10.0);
		assertTrue(result);

		result = Angles.isValueInTorerance(100.0, 110.0, 10.0);
		assertTrue(result);

		result = Angles.isValueInTorerance(100.0, 111.0, 10.0);
		assertFalse(result);

		result = Angles.isValueInTorerance(100.0, 89.0, 10.0);
		assertFalse(result);

		result = Angles.isValueInTorerance(180.0, 180.0, 0.0);
		assertTrue(result);

		result = Angles.isValueInTorerance(270.0, 270.0, 10.0);
		assertTrue(result);
	}

	@Test
	public void isAngleInRangeAndTolerance_critical_angles() {
		Boolean result = false;
		Angles direction, values;
		
		try {
			//0
			direction = new Angles(0.0, 0.0);
			values = new Angles(0.0, 0.0);

			result = Angles.isAngleInRangeAndTolerance(values, direction, 10.0);
			assertTrue(result);
			
			direction = new Angles(0.0, 0.0);
			values = new Angles(0.0, 90.0);
			
			result = Angles.isAngleInRangeAndTolerance(values, direction, 10.0);
			assertTrue(result);
			
			//90
			direction = new Angles(90.0, 90.0);
			values = new Angles(90.0, 90.0);

			result = Angles.isAngleInRangeAndTolerance(values, direction, 10.0);
			assertTrue(result);
			
			direction = new Angles(90.0, 0.0);
			values = new Angles(90.0, 90.0);

			result = Angles.isAngleInRangeAndTolerance(values, direction, 10.0);
			assertTrue(result);

			//180
			direction = new Angles(180.0, 180.0);
			values = new Angles(180.0, 180.0);

			result = Angles.isAngleInRangeAndTolerance(values, direction, 10.0);
			assertTrue(result);
			
			direction = new Angles(180.0, 0.0);
			values = new Angles(180.0, 90.0);

			result = Angles.isAngleInRangeAndTolerance(values, direction, 10.0);
			assertTrue(result);

			//270
			direction = new Angles(270.0, 270.0);
			values = new Angles(270.0, 270.0);

			result = Angles.isAngleInRangeAndTolerance(values, direction, 10.0);
			assertTrue(result);
			
			direction = new Angles(270.0, 0.0);
			values = new Angles(270.0, 90.0);

			result = Angles.isAngleInRangeAndTolerance(values, direction, 10.0);
			assertTrue(result);
		} catch (AngleDefinitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
