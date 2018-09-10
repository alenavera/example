package Task;

import java.util.Scanner;

public class VendingMachineChange {
	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);

	System.out.println("Enter  price in cents:");
	int priceInCent =input.nextInt();
	
	
    int total=100-priceInCent;
    
    int quarter3=total/25;
    int quarter2=total%25;
    int dimes1=quarter2/10;
    int dimes2=quarter2%10;
    int nickels1=dimes2/5;
    System.out.println("Your change is" +quarter3+" quarters,"+dimes1+" dimes,and "+nickels1+"nickels");
    
    
   }
	}
