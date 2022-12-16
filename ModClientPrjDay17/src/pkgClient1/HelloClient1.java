package pkgClient1;
import pkg1.*;
import pkg2.*;


public class HelloClient1 {
	public static void main(String[] args) {
		Server1 s1=new Server1();
		s1.serve1();
		Server2 s2=new Server2();
		s2.serve2();

	}


}
