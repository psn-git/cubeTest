package ch.nuedling.basics;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PositionTestdataLoader {
	CoordinatesSystemDefinition myCoordinatesSystemDefinition = null;
	private int lineNumber = 1; 
	private void readLineFromCSV(String line) {
		Scanner scanner = new Scanner(line);
		scanner.useDelimiter("; *");

		try {
			myCoordinatesSystemDefinition = new CoordinatesSystemDefinition(
					new BasePoint(scanner.nextInt(), scanner.nextInt(),
							scanner.nextInt()), new BasePoint(
							scanner.nextInt(), scanner.nextInt(),
							scanner.nextInt()), new BasePoint(
							scanner.nextInt(), scanner.nextInt(),
							scanner.nextInt()));
			Point pointOrigin = new Point(scanner.nextInt(), scanner.nextInt(),
					scanner.nextInt(), myCoordinatesSystemDefinition);
			Point point = new Point(scanner.nextInt(), scanner.nextInt(),
					scanner.nextInt(), myCoordinatesSystemDefinition);
			Double distance = scanner.nextDouble();
			Angles angles = new Angles(scanner.nextDouble(),
					scanner.nextDouble());
			PointPosition position = new PointPosition(pointOrigin);
			System.out.println(lineNumber);
			assertEquals("line number: "+lineNumber+" elevation", angles.getElevation(), position.getAnglesToPoint(point).getElevation(), 0.0001);
			assertEquals("line number: "+lineNumber+" azimuth", angles.getAzimuth(), position.getAnglesToPoint(point).getAzimuth(), 0.0001);
			assertEquals("line number: "+lineNumber+" distance", distance, position.getDistanceFromPoint(point),0.0001);
		} catch (CoordinatesSystemDefinitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PointDefinitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AngleDefinitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public PositionTestdataLoader(String fileName) {		
		File file = new File(fileName);
		System.out.println(file.getAbsolutePath());
		assertEquals(true, file.exists());
		
		try {
			Scanner scanner = new Scanner(file);
			scanner.useDelimiter(";*");
			scanner.nextLine();
			String line = "";
			while (scanner.hasNextLine()) {
				lineNumber++;
				line = scanner.nextLine();
				readLineFromCSV(line);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
}
