package pkgClient2;
import pkg1.*;
import pkg2.*;


public class Sum {
	public void sum(int x, int y) {
		System.out.println("x+y="+ (x+y));
		new Server1().serve1();
		new Server2().serve2();


	}

}
