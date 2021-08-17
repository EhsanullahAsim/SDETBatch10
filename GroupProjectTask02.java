package GroupProjects01;

public class GroupProjectTask02 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array or integer type where you will store odd and even numbers.
		 * Develop a program which will identify/print the even numbers only.
		 */
		int[][] arr = { { 1, 2 },
					{ 5, 6, 3, 2 }};

		for (int row = 0; row < arr.length; row++) {
			
			for (int col = 0; col < arr[row].length; col++) {
				
								
				if (arr[row][col] % 2 == 0) // != If you want to print odd 
				
				System.out.println(arr[row][col]);

			}

		}

	}

}
