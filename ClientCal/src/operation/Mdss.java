package operation;
import md.*;
import ss.*;

public class Mdss {
	public void calculate(String op, int x, int y) {
		int res=0;
		if(op.equals("+")) {
			res = new Add().Sum(x, y);
			
		}
		if(op.equals("-")) {
			res = new Sub().subtract(x, y);
			
		}
		if(op.equals("/")) {
			res = new Divide().div(x, y);
			
		}
		if(op.equals("*")) {
			res = new Mutli().mul(x, y);
			
		}
		System.out.println("The result is "+ res);
	}

}
