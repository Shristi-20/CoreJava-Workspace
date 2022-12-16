package tests;

import static org.junit.Assert.*;
import org.junit.*;
import source.*;

import org.junit.Test;

public class TestCases {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before all tests");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before each test");
	}

	@Test
	public void testFindMax() {
		System.out.println("test case1,2 find max");
		assertEquals(4, MainClass.findMax(new int[] { 1, 3, 4, 2 }));
		assertEquals(2, MainClass.findMax(new int[] { -12, -3, -4, 2 }));
	}

	@Test
	public void testCube() {
		System.out.println("test case cube");
		assertEquals(27, MainClass.cube(3));
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after each test");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after all tests");
	}
}

