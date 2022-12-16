package tests;
import source.*;
public class TestCases {
	static {
		System.out.println("The resources initialized before all tests");
	}
	public void finalize() {
		System.out.println("Close all the resources after all tests are over ");
		
	}
	public void beforeEachTest() {
		System.out.println("The resources initialized before individual tests ");
		
	}
	public void AfterEachTest() {
		System.out.println("Close all the resources after individual tests are over ");
		
	}
	public boolean testSquare(MainClass m, int x, int output) {
		beforeEachTest();
		if(m.square(x) == output) {
			System.out.println("Test of Square succedded as m.square of "+ x + " is " + output);
			AfterEachTest();
			return true;
		}
		System.out.println("Failure: Expected output was " + output + " but reult got was square of "+ x +" is "+ m.square(x));
		AfterEachTest();
		return false;
		
	}
	public boolean testCube(MainClass m, int x, int output) {
		beforeEachTest();
		if(m.cube(x) == output) {
			System.out.println("Test of Cube succedded as m.cube of "+ x + " is " + output);
			AfterEachTest();
			return true;
		}
		System.out.println("Failure: Expected output was " + output + " but reult got was cube of "+ x +" is "+ m.cube(x));
		AfterEachTest();
		return false;
		
	}


}

	


