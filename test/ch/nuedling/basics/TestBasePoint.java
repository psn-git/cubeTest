package ch.nuedling.basics;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBasePoint {

	@Test
	public void basePoint000() {
		Integer x = 0;
		Integer y = 0;
		Integer z = 0;
		
		BasePoint basePoint000 = new BasePoint(x, y, z);
		assertEquals(x, basePoint000.getX(), 0);
		assertEquals(y, basePoint000.getY(), 0);
		assertEquals(z, basePoint000.getZ(), 0);
	}

	@Test
	public void basePoint123() {
		Integer x = 1;
		Integer y = 2;
		Integer z = 3;
		BasePoint basePoint123 = new BasePoint(x, y, z);
		assertEquals(x, basePoint123.getX(), 0);
		assertEquals(y, basePoint123.getY(), 0);
		assertEquals(z, basePoint123.getZ(), 0);
	}

	@Test
	public void basePoint0_0__0_0__0_0() {
		Integer x = 0;
		Integer y = 0;
		Integer z = 0;
		BasePoint basePoint0_0__0_0__0_0 = new BasePoint(x, y, z);
		assertEquals(x, basePoint0_0__0_0__0_0.getX(), 0);
		assertEquals(y, basePoint0_0__0_0__0_0.getY(), 0);
		assertEquals(z, basePoint0_0__0_0__0_0.getZ(), 0);
	}

	@Test
	public void basePoint0_0009__0_0008__0_0007() {
		Integer x = 9;
		Integer y = 8;
		Integer z = 7;
		BasePoint basePoint0_0009__0_0008__0_0007 = new BasePoint(x, y, z);
		assertEquals(x, basePoint0_0009__0_0008__0_0007.getX(), 0);
		assertEquals(y, basePoint0_0009__0_0008__0_0007.getY(), 0);
		assertEquals(z, basePoint0_0009__0_0008__0_0007.getZ(), 0);
	}

	@Test
	public void basePoint9_1001__1_8008__2_7007() {
		Integer x = 9;
		Integer y = 1;
		Integer z = 2;
		BasePoint basePoint9_1001__1_8008__2_7007 = new BasePoint(x, y, z);
		assertEquals(x, basePoint9_1001__1_8008__2_7007.getX(), 0);
		assertEquals(y, basePoint9_1001__1_8008__2_7007.getY(), 0);
		assertEquals(z, basePoint9_1001__1_8008__2_7007.getZ(), 0);
	}
	@Test
	public void basePoint_9_1001__1_8008__2_7007() {
		Integer x = 9;
		Integer y = 1;
		Integer z = 2;
		BasePoint basePoint_9_1001__1_8008__2_7007 = new BasePoint(x, y, z);
		assertEquals(x, basePoint_9_1001__1_8008__2_7007.getX(), 0);
		assertEquals(y, basePoint_9_1001__1_8008__2_7007.getY(), 0);
		assertEquals(z, basePoint_9_1001__1_8008__2_7007.getZ(), 0);
	}
}
