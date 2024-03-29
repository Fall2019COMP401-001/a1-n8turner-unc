package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int count = scan.nextInt();
		double[] prices = new double[count];
		String[] itemNames = new String[count];
		boolean[] boughtYet = new boolean[count];
		
		for(int i = 0; i < count; i++) { // collects item data
			itemNames[i] = scan.next();
			prices[i] = scan.nextDouble(); 
			boughtYet[i] = false;
		}
		
		int customers = scan.nextInt();
		String naming = "";
		int numItems = 0;
		String[] firstNames = new String[customers];
		String[] lastNames = new String[customers];
		int[] itemAmounts = new int[count];
		int[] numCustomers = new int[count];
		
		for (int i = 0; i < customers; i++) { //collects inputs for each customer
			firstNames[i] = scan.next();
			lastNames[i] = scan.next();
			numItems = scan.nextInt();
			for(int j = 0; j < numItems; j++) {		//associates customer items through names
				int numBought = scan.nextInt();
				naming = scan.next();
				for (int k = 0; k < itemNames.length; k++) {  //counts item amounts
					if(naming.equals(itemNames[k])) {
						for (int l = 0; l < numBought; l++) {
							itemAmounts[k]++;
							if(numCustomers[k]<i+1 && !boughtYet[k]) {  //denies double count of repeat customers
								numCustomers[k]++;
								boughtYet[k] = true;
							}
						}
					}
				}
			}
			for(int j = 0; j < boughtYet.length; j++) {   //resets status of item for next customer
				boughtYet[j] = false;
			}
		}
		
		for(int i = 0; i < count; i++) {  //prints output
			if(itemAmounts[i]==0) {
				System.out.println("No customers bought " + itemNames[i]);
			}
			else {
				System.out.println(numCustomers[i] + " customers bought " + itemAmounts[i] + " " + itemNames[i]);
			}
		}
		
	}
}
