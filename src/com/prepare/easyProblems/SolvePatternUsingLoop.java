package com.prepare.easyProblems;

public class SolvePatternUsingLoop {

	public static void main(String[] args) {
		int n = 5;
		
		pattern3(n);

	}
	
//	1.*****
//    *****
//    *****
//    *****
//    *****

	public static void pattern1(int n) {
		for (int i = 0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
// 2. *
//    **
//    ***
//    ****
//    *****
	
	public static void pattern2(int n) {
		for (int i = 0;i<n;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
//	3.*****
//    ****
//    ***
//    **
//    *
	
	//solve using recursion
	
	public static void pattern3(int n) {
		pattern3Helper(n, 1);
	}
	
	public static void pattern3Helper(int n, int row) {
		if (row > n) {
			return;
		}
		// print stars
		for (int col = 1; col <= n - row + 1; col++) {
			System.out.print("* ");
		}
		System.out.println();
		pattern3Helper(n, row + 1);
	}
	
//	public static void pattern3(int n) {
//		for (int row = 1; row <= n; row++) {
//			for (int col = 1; col <= n+1-row; col++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//	}
	
//	4.1
//    1 2
//    1 2 3
//    1 2 3 4
//    1 2 3 4 5
	
	public static void pattern4(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}
	
//	5.*
//    **
//    ***
//    ****
//    *****
//    ****
//    ***
//    **
//    *
	
	
	
    
	
	public static void pattern5(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col < n+1-row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
//	6. *
//    **
//   ***
//  ****
// *****
	
	public static void pattern6(int n) {
		for (int row = 1; row <= n; row++) {
			// spaces
			for (int col = 1; col <= n - row; col++) {
				System.out.print(" ");
			}
			// stars
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//	7.*****
//    ****
//     ***
//      **
//       *

	public static void pattern7(int n) {
		for (int row = 1; row <= n; row++) {
			// spaces
			for (int col = 1; col <= row-1; col++) {
				System.out.print(" ");
			}
			// stars
			for (int col = 1; col <= n-row+1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

//	8. *
//    ***
//   *****
//  *******
// *********
	
	public static void pattern8(int n) {
	    for (int row = 1; row <= n; row++) {

	        // spaces
	        for (int col = 1; col <= n - row; col++) {
	            System.out.print(" ");
	        }

	        // stars (odd count)
	        for (int col = 1; col <= 2 * row - 1; col++) {
	            System.out.print("*");
	        }

	        System.out.println();
	    }
	}

// 9.*********
//    *******
//     *****
//      ***
//       *
	
	public static void pattern9(int n) {
	    for (int row = 1; row <= n; row++) {

	        // spaces
	        for (int col = 1; col <= row - 1; col++) {
	            System.out.print(" ");
	        }

	        // stars (odd count)
	        for (int col = 1; col <= 2 * (n - row) + 1; col++) {
	            System.out.print("*");
	        }

	        System.out.println();
	    }
	}
	
//	10.*
//    * *
//   * * *
//  * * * *
// * * * * *
	
	public static void pattern10(int n) {
	    for (int row = 1; row <= n; row++) {

	        // spaces
	        for (int col = 1; col <= n - row; col++) {
	            System.out.print(" ");
	        }

	        // stars with spaces
	        for (int col = 1; col <= row; col++) {
	            System.out.print("* ");
	        }

	        System.out.println();
	    }
	}
	
	

}
