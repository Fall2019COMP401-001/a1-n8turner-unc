package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		double[] prices = new double[count];
		String[] itemNames = new String[count];
		
		for(int i = 0; i < count; i++) { // collects item data
			itemNames[i] = scan.next();
			prices[i] = scan.nextDouble(); 
		}
		
		int customers = scan.nextInt();
		int multiplier = 0;
		String naming = "";
		int numItems = 0;
		int index = 0;
		double[] bills = new double[customers];
		String[] firstNames = new String[customers];
		String[] lastNames = new String[customers];
		
		for (int i = 0; i < customers; i++) { //collects inputs for each customer
			double bill = 0.0;
			firstNames[i] = scan.next();
			lastNames[i] = scan.next();
			numItems = scan.nextInt();
			for(int j = 0; j < numItems; j++) {		//associates customer items with prices
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
		
		for (int i = 0; i < bills.length; i++) { //finds highest paying customer
			if(bills[i]>most) {
				most = bills[i];
				highest = i;
			}
		}
		
		int lowest = 0;
		double least = most;
		for (int i = 0; i < bills.length; i++) { //finds lowest paying customer
			if(bills[i]<least) {
				least = bills[i];
				lowest = i;
			}
		}
		
		double average = 0.0;
		
		for(int i = 0; i < bills.length; i++) { 
			average+=bills[i];
		}
		
		average /= bills.length; //computes average
		System.out.println("Biggest: " + firstNames[highest] + " " + lastNames[highest] + " (" + String.format("%.2f", bills[highest]) + ")"); //prints output
		System.out.println("Smallest: " + firstNames[lowest] + " " + lastNames[lowest] + " (" + String.format("%.2f", bills[lowest]) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
	}
}
