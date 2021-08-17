package GroupProjects01;

public class GrupProjectTask05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a java program to check whether a given number is prime or not?
		// Numver which divide by 1 and itself is a  prime number
	int number=5;  // change the number and try different number to check
	boolean isprime=true;
	if (number>1) {
		for(int i=2; i<number; i++) {
			if (number%i==0) {
				isprime=false;
				break;
			}
		}
	}else {
		isprime=false;
	}
	System.out.println(number+ " isprime "+isprime);
	
	
	
	}
	

}
