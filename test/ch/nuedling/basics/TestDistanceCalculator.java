package ch.nuedling.basics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestDistanceCalculator {
	@Test
	public void TestxP1_5xP2__10() {
		Integer xH = 10;
		Integer yH = 10;
		Integer zH = 10;

		Integer xL = -10;
		Integer yL = -10;
		Integer zL = -10;

		Integer xZ = 0;
		Integer yZ = 0;
		Integer zZ = 0;

		Integer xP1 = 5;
		Integer yP1 = 0;
		Integer zP1 = 0;

		Integer xP2 = -10;
		Integer yP2 = 0;
		Integer zP2 = 0;

		double xPr = 15;
		double yPr = 0;
		double zPr = 0;

		try {
			CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
					new BasePoint(xZ, yZ, zZ));
			Point point1 = new Point(xP1, yP1, zP1,
					myCoordinatesSystemDefinition);
			Point point2 = new Point(xP2, yP2, zP2,
					myCoordinatesSystemDefinition);
			PointToPointDistance distance = Point.calculateAbsoluteCoordinatesDifferences(
					point1, point2);
			assertEquals(xPr, distance.getDeltaX(), 0);
			assertEquals(yPr, distance.getDeltaY(), 0);
			assertEquals(zPr, distance.getDeltaZ(), 0);
		} catch (CoordinatesSystemDefinitionException e) {
			e.printStackTrace();
		} catch (PointDefinitionException e) {
			// thrown = true;
			e.printStackTrace();
		}
		// assertTrue(thrown);

	}

	@Test
	public void TestxP1__5xP2_10() {
		Integer xH = 10;
		Integer yH = 10;
		Integer zH = 10;

		Integer xL = -10;
		Integer yL = -10;
		Integer zL = -10;

		Integer xZ = 0;
		Integer yZ = 0;
		Integer zZ = 0;

		Integer xP1 = -5;
		Integer yP1 = 0;
		Integer zP1 = 0;

		Integer xP2 = 10;
		Integer yP2 = 0;
		Integer zP2 = 0;

		double xPr = 15;
		double yPr = 0;
		double zPr = 0;

		try {
			CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
					new BasePoint(xZ, yZ, zZ));
			Point point1 = new Point(xP1, yP1, zP1,
					myCoordinatesSystemDefinition);
			Point point2 = new Point(xP2, yP2, zP2,
					myCoordinatesSystemDefinition);
			PointToPointDistance distance = Point.calculateAbsoluteCoordinatesDifferences(
					point1, point2);
			assertEquals(xPr, distance.getDeltaX(), 0);
			assertEquals(yPr, distance.getDeltaY(), 0);
			assertEquals(zPr, distance.getDeltaZ(), 0);
		} catch (CoordinatesSystemDefinitionException e) {
			e.printStackTrace();
		} catch (PointDefinitionException e) {
			// thrown = true;
			e.printStackTrace();
		}
		// assertTrue(thrown);

	}

	@Test
	public void TestxP1_5xP2_10() {
		Integer xH = 10;
		Integer yH = 10;
		Integer zH = 10;

		Integer xL = -10;
		Integer yL = -10;
		Integer zL = -10;

		Integer xZ = 0;
		Integer yZ = 0;
		Integer zZ = 0;

		Integer xP1 = 5;
		Integer yP1 = 0;
		Integer zP1 = 0;

		Integer xP2 = 10;
		Integer yP2 = 0;
		Integer zP2 = 0;

		double xPr = 5;
		double yPr = 0;
		double zPr = 0;

		try {
			CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
					new BasePoint(xZ, yZ, zZ));
			Point point1 = new Point(xP1, yP1, zP1,
					myCoordinatesSystemDefinition);
			Point point2 = new Point(xP2, yP2, zP2,
					myCoordinatesSystemDefinition);
			PointToPointDistance distance = Point.calculateAbsoluteCoordinatesDifferences(
					point1, point2);
			assertEquals(xPr, distance.getDeltaX(), 0);
			assertEquals(yPr, distance.getDeltaY(), 0);
			assertEquals(zPr, distance.getDeltaZ(), 0);
		} catch (CoordinatesSystemDefinitionException e) {
			e.printStackTrace();
		} catch (PointDefinitionException e) {
			// thrown = true;
			e.printStackTrace();
		}
		// assertTrue(thrown);

	}

	@Test
	public void TestAll() {
		Integer xH = 10;
		Integer yH = 10;
		Integer zH = 10;

		Integer xL = -10;
		Integer yL = -10;
		Integer zL = -10;

		Integer xZ = 0;
		Integer yZ = 0;
		Integer zZ = 0;

		Integer xP1 = 1;
		Integer yP1 = 2;
		Integer zP1 = 3;

		Integer xP2 = 10;
		Integer yP2 = 5;
		Integer zP2 = 1;

		double xPr = 9;
		double yPr = 3;
		double zPr = 2;

		try {
			CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
					new BasePoint(xZ, yZ, zZ));
			Point point1 = new Point(xP1, yP1, zP1,
					myCoordinatesSystemDefinition);
			Point point2 = new Point(xP2, yP2, zP2,
					myCoordinatesSystemDefinition);
			PointToPointDistance distance = Point.calculateAbsoluteCoordinatesDifferences(
					point1, point2);
			assertEquals(xPr, distance.getDeltaX(), 0);
			assertEquals(yPr, distance.getDeltaY(), 0);
			assertEquals(zPr, distance.getDeltaZ(), 0);
		} catch (CoordinatesSystemDefinitionException e) {
			e.printStackTrace();
		} catch (PointDefinitionException e) {
			// thrown = true;
			e.printStackTrace();
		}
		// assertTrue(thrown);

	}

	@Test
	public void TestxP1_0xP2_10() {
		Integer xH = 10;
		Integer yH = 10;
		Integer zH = 10;

		Integer xL = -10;
		Integer yL = -10;
		Integer zL = -10;

		Integer xZ = 0;
		Integer yZ = 0;
		Integer zZ = 0;

		Integer xP1 = 0;
		Integer yP1 = 2;
		Integer zP1 = 3;

		Integer xP2 = -10;
		Integer yP2 = 5;
		Integer zP2 = 1;

		double xPr = 10;
		double yPr = 3;
		double zPr = 2;

		try {
			CoordinatesSystemDefinition myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
					new BasePoint(xZ, yZ, zZ));
			Point point1 = new Point(xP1, yP1, zP1,
					myCoordinatesSystemDefinition);
			Point point2 = new Point(xP2, yP2, zP2,
					myCoordinatesSystemDefinition);
			PointToPointDistance distance = Point.calculateAbsoluteCoordinatesDifferences(
					point1, point2);
			assertEquals(xPr, distance.getDeltaX(), 0);
			assertEquals(yPr, distance.getDeltaY(), 0);
			assertEquals(zPr, distance.getDeltaZ(), 0);
		} catch (CoordinatesSystemDefinitionException e) {
			e.printStackTrace();
		} catch (PointDefinitionException e) {
			// thrown = true;
			e.printStackTrace();
		}
		// assertTrue(thrown);

	}

	@Test
	public void TestCoordinatesException() {
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

		Integer xP1 = 0;
		Integer yP1 = 2;
		Integer zP1 = 3;

		Integer xP2 = -10;
		Integer yP2 = 5;
		Integer zP2 = 1;

		double xPr = 10;
		double yPr = 3;
		double zPr = 2;

		try {
			CoordinatesSystemDefinition myCoordinatesSystemDefinition1 = new CoordinatesSystemDefinition(
					new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
					new BasePoint(xZ, yZ, zZ));
			CoordinatesSystemDefinition myCoordinatesSystemDefinition2 = new CoordinatesSystemDefinition(
					new BasePoint(xH, yH, zH), new BasePoint(xL, yL, zL),
					new BasePoint(xZ+1, yZ, zZ));
			Point point1 = new Point(xP1, yP1, zP1,
					myCoordinatesSystemDefinition1);
			Point point2 = new Point(xP2, yP2, zP2,
					myCoordinatesSystemDefinition2);
			PointToPointDistance distance = Point.calculateAbsoluteCoordinatesDifferences(
					point1, point2);
			assertEquals(xPr, distance.getDeltaX(), 0);
			assertEquals(yPr, distance.getDeltaY(), 0);
			assertEquals(zPr, distance.getDeltaZ(), 0);
		} catch (CoordinatesSystemDefinitionException e) {
			//e.printStackTrace();
			thrown = true;
		} catch (PointDefinitionException e) {

			e.printStackTrace();
		}
		assertTrue(thrown);

	}
	
	@Test
	public void TestCalculateAbsoluteDifference() {
		Integer value1 = 0;
		Integer value2 = 1;
		Integer result = 1;
		assertEquals(result, DistanceCalculator.calculateAbsoluteDifference(value1, value2));
	}
	@Test
	public void TestCalculateAbsoluteDifference1() {
		Integer value1 = 1;
		Integer value2 = 1;
		Integer result = 0;
		assertEquals(result, DistanceCalculator.calculateAbsoluteDifference(value1, value2));
	}	
	
	@Test
	public void TestCalculateAbsoluteDifference2() {
		Integer value1 = 0;
		Integer value2 = -1;
		Integer result = 1;
		assertEquals(result, DistanceCalculator.calculateAbsoluteDifference(value1, value2));
	}
	
	@Test
	public void TestCalculateAbsoluteDifference3() {
		Integer value1 = 0;
		Integer value2 = 0;
		Integer result = 0;
		assertEquals(result, DistanceCalculator.calculateAbsoluteDifference(value1, value2));
	}
	
	@Test
	public void TestCalculateAbsoluteDifference4() {
		Integer value1 = -1;
		Integer value2 = 0;
		Integer result = 1;
		assertEquals(result, DistanceCalculator.calculateAbsoluteDifference(value1, value2));
	}
	
	@Test
	public void TestCalculateAbsoluteDifference5() {
		Integer value1 = 0;
		Integer value2 = -1;
		Integer result = 1;
		assertEquals(result, DistanceCalculator.calculateAbsoluteDifference(value1, value2));
	}
	
	@Test
	public void TestCalculateAbsoluteDifference6() {
		Integer value1 = -1;
		Integer value2 = -1;
		Integer result = 0;
		assertEquals(result, DistanceCalculator.calculateAbsoluteDifference(value1, value2));
	}
	@Test
	public void TestCalculateAbsoluteDifference7() {
		Integer value1 = -1;
		Integer value2 = -2;
		Integer result = 1;
		assertEquals(result, DistanceCalculator.calculateAbsoluteDifference(value1, value2));
	}
	
	@Test
	public void TestCalculateAbsoluteDifference8() {
		Integer value1 = -2;
		Integer value2 = -1;
		Integer result = 1;
		assertEquals(result, DistanceCalculator.calculateAbsoluteDifference(value1, value2));
	}
	
	@Test
	public void TestCalculateAbsoluteDifference9() {
		Integer value1 = 1;
		Integer value2 = 2;
		Integer result = 1;
		assertEquals(result, DistanceCalculator.calculateAbsoluteDifference(value1, value2));
	}
	
	@Test
	public void TestCalculateAbsoluteDifference10() {
		Integer value1 = -1;
		Integer value2 = -2;
		Integer result = 1;
		assertEquals(result, DistanceCalculator.calculateAbsoluteDifference(value1, value2));
	}
	@Test
	public void TestCalculateAbsoluteDifference11() {
		Integer value1 = -10;
		Integer value2 = 2;
		Integer result = 12;
		assertEquals(result, DistanceCalculator.calculateAbsoluteDifference(value1, value2));
	}
	@Test
	public void TestCalculateAbsoluteDifference12() {
		Integer value1 = 10;
		Integer value2 = -2;
		Integer result = 12;
		assertEquals(result, DistanceCalculator.calculateAbsoluteDifference(value1, value2));
	}
}
