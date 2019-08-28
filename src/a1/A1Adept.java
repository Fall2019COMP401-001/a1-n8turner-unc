package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		/*An integer count of the number of items in the store.
		Then for each item in the store...
		The name of each item (a single word)
		The price of the item
		An integer count of the number of customers
		Then for each customer...
		The first name of the customer
		The last name of the customer
		An integer count of the number of items the customer bought.
		For each of the items bought...
		The quantity of the item bought
		The name of the item
		
		Output:
		Biggest: Janet Weiss (12.50)
		Smallest: Corin Tucker (4.55)
		Average: 8.70
		*
		*/
		
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		double[] prices = new double[count];
		String[] itemNames = new String[count];
		for(int i = 0; i < count; i++) {
			itemNames[i] = scan.next();
			prices[i] = scan.nextDouble(); 
		}
		int customers = scan.nextInt();
		double totalPrice = 0.0;
		int multiplier = 0;
		String naming = "";
		int numItems = 0;
		int index = 0;
		double[] bills = new double[customers];
		String[] firstNames = new String[customers];
		String[] lastNames = new String[customers];
		for (int i = 0; i < customers; i++) {
			double bill = 0.0;
			firstNames[i] = scan.next();
			lastNames[i] = scan.next();
			numItems = scan.nextInt();
			for(int j = 0; j < numItems; j++) {
				multiplier = scan.nextInt();
				naming = scan.next();
				for (int k = 0; k < itemNames.length; k++) {
					if(itemNames[k].equals(naming)) {
						index = k;
						break;
					}
				}
				bill += prices[index]*multiplier;
			}
			bills[i] = bill;
		}
		int highest = 0;
		double most = 0.0;
		for (int i = 0; i < bills.length; i++) {
			if(bills[i]>most) {
				most = bills[i];
				highest = i;
			}
		}
		int lowest = 0;
		double least = most;
		for (int i = 0; i < bills.length; i++) {
			if(bills[i]<least) {
				least = bills[i];
				lowest = i;
			}
		}
		double average = 0.0;
		for(int i = 0; i < bills.length; i++) {
			average+=bills[i];
		}
		average /= bills.length;
		System.out.println("Biggest: " + firstNames[highest] + " " + lastNames[highest] + " (" + bills[highest] + ")");
		System.out.println("Smallest: " + firstNames[lowest] + " " + lastNames[lowest] + " (" + bills[lowest] + ")");
		System.out.println("Average: " + average);
	}
}
