package week2BooleanConditionalsLoops;

import java.util.Scanner;

public class BooleanConditionalsLoops {

	public static void main(String[] args) {
		//welcome message
		System.out.println("BE DEVELOPER WEEK 2 | CONDITIONS AND LOOPS");
		System.out.println("Program by Christian M Rapp\n");
				
			/* WEEK 2 LAB 1: LICENSE ***************************************************** */
			
			//declare variables
			int labNumber = 1;
			System.out.println("\nLab # " + labNumber +" output:");
			
			int age = 17;
			boolean hasLicense = false;
			
			if (age >= 16 && hasLicense) {
				System.out.println("You can drive.");
			}// end if
			
			else {
				System.out.println("You cannot drive");
			}// end else
			
			/* WEEK 2 LAB 1: MILK ****************************************************** */
			
			//declare variables
			double costOfMilk = 0;
			int thirstLevel = 7;
			
			if (costOfMilk < 2.5 || thirstLevel > 6) {
				System.out.println("Milk Please");
			}// end if
			else {
				System.out.println("No Thanks.");
			}// end else
				
			/* WEEK 2 LAB 1: COOKIES **************************************************** */
			
			//declare variables
			int numberOfCookies = 20;
			int numberOfChildren = 12;
			
			if (numberOfCookies % numberOfChildren >= 5) {
				System.out.println("Jackpot!");
			} else if (numberOfCookies % numberOfChildren >= 2) {
					System.out.println("Woohoo!");
			} else if (numberOfCookies % numberOfChildren > 0) {
					System.out.println("Yes!");
			} else {
					System.out.println("Sad Face");
					}
		
			
			/* WEEK 2 LAB 2: LOYALTY MEMBER ********************************************* */
			//declare variables
			
			labNumber = 2;
			System.out.println("\nLab # " + labNumber +" output:");
			
			String loyaltyMemberStatus = "GOLD";
			double loyaltyMemberDiscount = 0.0;
			
			switch(loyaltyMemberStatus) {
				case "SILVER":
					loyaltyMemberDiscount = 0.10;
					break;
				case "GOLD":
					loyaltyMemberDiscount = 0.15;
					break;
				case "PLATINUM":
					loyaltyMemberDiscount = 0.25;
					break;
					
			}//end case
			System.out.println("Loyalty Member Discount is " + loyaltyMemberStatus + " (" + loyaltyMemberDiscount + ")");
			
			/* WEEK 2 LAB 2: BILL TOTAL ************************************************** */
			
			
			//declare variables
			double billTotal = 640.50;
			double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;
			System.out.println("The adjusted total with "+ loyaltyMemberStatus +" is: " + adjustedTotal);
			
			if (adjustedTotal > 500) {
				if (loyaltyMemberStatus == "SILVER") {
					loyaltyMemberStatus = "GOLD";
					System.out.println("Congratulations! Your Loyalty Member Status has been upgraded to " + loyaltyMemberStatus + "!");
				} else if (loyaltyMemberStatus == "GOLD") {
				loyaltyMemberStatus = "PLATINUM";
				System.out.println("Congratulations! Your Loyalty Member Status has been upgraded to " + loyaltyMemberStatus + "!");
				}
				System.out.println();
			}
			
			/* WEEK 2 LAB 2: USER NAME AND PASSWORD **************************************** */
			
			//declare variables
			String userName ="Tommy123";
			String password = "12345";
			
			if (userName.equals( "Tommy123") && password.equals("12345")) {
				System.out.println("Login Successful.");
			} else {
				System.out.println("Access denied.");
			}
			System.out.println();
			
			
			/* WEEK 2 LAB 3: LOOPS ********************************************************** */
		
			labNumber = 3;
			System.out.println("\nLab # " + labNumber +" output:");
			
			for (int i=0; i < 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
				
			for (int i=10; i >=0 ; i--) {
				System.out.print(i + " ");
			}
			
			System.out.println();
			
			for (int i = 0; i <=100; i++ ) {
				if (i % 2 == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
			
			for (int i = 0; i <=100; i++ ) {
				if (i % 2 == 0) {
					System.out.println(i + " = EVEN");
				}else {
					System.out.println(i + " = ODD");
				}
			}
			System.out.println();
			
			int i=100;
			while (i > 0){
				System.out.println("The remainder of "+ i + "/3 is: " + (i % 3));
				i--;
				} 
	}// end main

}// end BooleanConditionsLoops
