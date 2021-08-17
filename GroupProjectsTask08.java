package GroupProjects01;

import java.util.Scanner;

public class GroupProjectsTask08 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?

		int arr[] = { 10, 45, 20, 90, 80, 62, };
		int Firstlargest = arr[0];
		int Secondlargest = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > Firstlargest) {
				Secondlargest = Firstlargest;
				Firstlargest = arr[i];
			} else if (arr[i] > Secondlargest) {
				Secondlargest = arr[i];
			}

		}

		System.out.println(Firstlargest);
		System.out.println(Secondlargest);
	}

}
