package GroupProjects01;

import java.util.Scanner;

public class GroupPorjectTask04UsingScanner {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable?

		Scanner sc=new Scanner(System.in);
		System.out.println("Please swip two number");
		 int x =sc.nextInt();
		 int y =sc.nextInt();
		 
		 System.out.println("Before swipping number: "+x +" "+y);
		 // Swipping
		 
		 x=x+y;
		 y=x-y;
		 x=x-y;
		 System.out.println("After swipping number: "+x +" " +y);
		 
	}

}
