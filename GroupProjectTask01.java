package GroupProjects01;

public class GroupProjectTask01 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.
		
		int [][] array= { { 10, 20, 30, 40, 50 },
						{ 5, 10, 15, 20 } };
		
		System.out.println("Number of row in above 2D array"+array.length);
		
		int sum=0;
		
		for (int row = 0; row < array.length; row++) {

			
			
			System.out.println("Number of columns in the "+ row+" row "+array[row].length);
			
			for (int col = 0; col < array[row].length; col++) {

				System.out.println(array[row][col]);
				sum=sum+array[row][col];
			}
			
			}
		System.out.println("sum "+sum);
		}
		
	}


