package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String output="";
		System.out.println("How many customers are there?");
		int customers = scan.nextInt();
		//iterates through customers
		for (int i = 0; i<customers; i++) {
			System.out.println("What is the customer's first, last name, and the number of items they are purchasing?");
			String firstName = scan.next();
			String lastName = scan.next();
			int items = scan.nextInt();
			double sum = 0.0;
			System.out.println();
			for (int j = 0; j < items; j++) {
				System.out.println("How many of this item is the customer purchasing, what is the name of the item, and how much does one unit cost?");
				int quantity = scan.nextInt();
				String item = scan.next();
				double price = scan.nextDouble();
				sum+= (double)quantity * price;
			}
			output = output + firstName.charAt(0) + ". " + lastName + " " + String.format("%.2f", sum) + "\n"; 
		}
		System.out.print(output);
	}
	
}
