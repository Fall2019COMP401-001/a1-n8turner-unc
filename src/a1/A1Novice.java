package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String output="";
		int customers = scan.nextInt();
		//iterates through customers, collecting data
		for (int i = 0; i<customers; i++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int items = scan.nextInt();
			double sum = 0.0;
			for (int j = 0; j < items; j++) {  //collects data for each item and sums
				int quantity = scan.nextInt();
				String item = scan.next();
				double price = scan.nextDouble();
				sum+= (double)quantity * price;
			}
			//constructs output
			output = output + firstName.charAt(0) + ". " + lastName + ": " + String.format("%.2f", sum) + "\n"; 
		}
		System.out.print(output);
	}
	
}
