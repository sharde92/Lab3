import java.util.Scanner;

public class evenOdd {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userNum = 0;
		
		System.out.println("Enter an integer between 1 and 100. ");
		userNum = scnr.nextInt();
		
		if (userNum % 2==0) {
			System.out.println("The integer " + userNum + " is even. ");

				
		}else if (userNum % 2!=0) {
			System.out.println("The integer " + userNum + " is odd. ");
		
			if (userNum>=2 && userNum<=25) {
			System.out.println("Even and less than 25. ");
		}
		if (userNum>=26 && userNum<=60){
			System.out.println("Even");
		}
	if (userNum>60) {
		System.out.println(userNum + " Even. ");
	}
	
	else if (userNum > 60) {
		System.out.println(userNum + " is odd and over 60. ");
	}
	}
	}
}	
		
		
		
		
		
	 

