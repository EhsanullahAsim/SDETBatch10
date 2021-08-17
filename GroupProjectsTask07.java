package GroupProjects01;

public class GroupProjectsTask07 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array?

		int arr[] = { 10, 45, 20, 90, 80, 62, };
		int largest = arr[0];
		int smallest=arr[0];
		
		for (int i = 0; i < arr.length; i++) {

			
			if (arr[i] > largest) {
				
				largest = arr[i];
			} 
			if (arr[i]<smallest) {
				smallest=arr[i];
			}
			}

			System.out.println(largest);
			System.out.println(smallest);
	}

}
