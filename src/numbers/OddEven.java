// Java program to Find Odd or Even number

package numbers;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		
		int number = scanner.nextInt();

				if (number % 2 == 0) 
		{
		    System.out.println(number + " is even.");
		} else {
		    System.out.println(number + " is odd.");
		}

		scanner.close();
				
	}

}
