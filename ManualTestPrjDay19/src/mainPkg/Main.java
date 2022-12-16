package mainPkg;
import source.*;
import tests.*;

public class Main {

	public static void main(String[] args) {
		MainClass m=new MainClass();
		TestCases t=new TestCases();
		if(t.testSquare(m, 2, 4)) {
			System.out.println("Square Test resulted in success");
		}
		else
 			System.out.println("Square Test resulted in failure");
		if(t.testCube(m, 2, 4)) {
			System.out.println("Cube Test resulted in success");
		}
		else
			System.out.println("Cube Test resulted in failure");
		t=null;
		System.gc();
	}

}

