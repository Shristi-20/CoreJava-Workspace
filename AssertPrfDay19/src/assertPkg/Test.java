package assertPkg;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		System.out.println("Enter your Weight: ");
		int value= new Scanner(System.in).nextInt();
		assert value >= 20 : " You are Underweight"; 
        System.out.println("value is "+value); 


	}

}
