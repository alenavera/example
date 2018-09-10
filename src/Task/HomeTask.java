package Task;

import java.util.Scanner;

public class HomeTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Enter vote age:");
		
	
		int personAge=input.nextInt();
		
		if(personAge>=18) {
			System.out.println("You are eligible to vote");
		}

	}

}


