package exercises;

public class Pascal {
	public static void main(String[] args) {		
		 for (int l = 1; l <= 5; l++) {
	            for (int j = 0; j <= 5 - l; j++) {
	 
	                    System.out.print(" ");
	            }
	 
	            
	            int C = 1;
	            for (int i = 1; i <= l; i++) {
	 
	                
	                System.out.print(C + " ");
	                C = C * (l - i) / i;
	            }
	            System.out.println();
	        }

	}

}