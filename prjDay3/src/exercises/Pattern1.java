package exercises;

public class Pattern1 {
	public static void main(String[] args) {
//		for(int i=0;i<4;i++) {
//			System.out.print(i+" ");
//			for(int j=0;j<i;j++) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
		
		
//		
//		for(int i=1;i<5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		 for (int l = 1; l <= 5; l++) {
	            for (int j = 0; j <= 5 - l; j++) {
	 
	                // for left spacing
	                System.out.print(" ");
	            }
	 
	            // used to represent C(line, i)
	            int C = 1;
	            for (int i = 1; i <= l; i++) {
	 
	                // The first value in a line is always 1
	                System.out.print(C + " ");
	                C = C * (l - i) / i;
	            }
	            System.out.println();
	        }

	}

}
