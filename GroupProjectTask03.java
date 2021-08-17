package GroupProjects01;

public class GroupProjectTask03 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integers.
		 * Develop a program which will calculate the sum of  even and odd numbers for that array.
		 */

		int evensum = 0;
		int oddsum=0;
		int[][] arry = {
				{ 1, 2, 3, 4, 5,  },
				{ 6, 7, 8, 9, 10,  }};
				
		for (int row = 0; row < arry.length; row++) {
			for (int col = 0; col < arry[row].length; col++) {
			
				if (arry[row][col] % 2 == 0) {
					
					evensum=evensum+ arry[row][col];
					
					
				}else {
					oddsum= oddsum+arry[row][col];
						
					}	
			}
		}
		
		System.out.println("Even number sum "+evensum);
		System.out.println("Odd number sum "+oddsum);
	
	}

}
