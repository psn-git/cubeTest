package ch.nuedling.basics;

import java.io.File;

import org.junit.Test;

public class TestPositionBulk {
	@Test
	public void BulkTest() {
		File file = new File("");
		System.out.println(file.getAbsolutePath());
		PositionTestdataLoader myTestDataLoader = new PositionTestdataLoader(
				"test\\Position_Testdata.csv");

	}
}
