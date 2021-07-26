package lab;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
//				 User Input Section
		Scanner kb = new Scanner (System.in);
		
		System.out.println("Please enter item price: \n");
		double total = kb.nextDouble();
		System.out.println(" ");
		System.out.println("You said: $" + total +"\n");
		
		System.out.println("How much money are you paying with? \n");
		double tendered = kb.nextDouble();
		System.out.println(" ");
		
		kb.close();
			
//				Variables
		double change = tendered - total;
		int dollars = (int) change;
		float cents = (float) (change - dollars);

//				Dollars Calculations
		
		int twenty = dollars / 20;
		int ten = (dollars % 20) / 10;
		int five = ((dollars %20) % 10) / 5;
		int one = (((dollars % 20) % 10) % 5) / 1;
		
//				Change Calculations
		int quarter = (int) (cents / .25);
		int dime = (int) ((cents % .25) / .10);
		int nickel = (int)(((cents % .25) % .10) / .05);
		int penny = (int) Math.round((cents % .25 % .10 % .05) / .01);

		
		if (total > tendered) {
			System.out.println("Not enough funds! \n ");
		}
		if (total == tendered) {
			System.out.println("You paid the exact amount. Have a great day! ");
		}
		if (tendered > total) {
			// Dollars
			if(twenty > 0) {
				System.out.print(twenty + " twenty dollar bill, ");
			}
			if (ten > 0) {
				System.out.print(ten + " ten dollar bill, ");
			}
			if (five > 0) {
				System.out.print(five + " five dollar bill, ");
			}
			if (one > 0) {
				System.out.print(one + " one dollar bill, ");
			}
			// coins
			if (quarter > 0) {
				System.out.print(quarter + " Quarters, ");
			}
			if (dime > 0) {
				System.out.print(dime + " Dimes, ");
			}
			if (nickel > 0) {
				System.out.print(nickel + " Nickels, ");
			}
			if (penny > 0) {
				System.out.print(penny + " Pennies. ");
			}
		}
	}
}
