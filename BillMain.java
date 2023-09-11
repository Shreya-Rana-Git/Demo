package org.anudip.javabean;

import java.util.Scanner;

public class BillMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the number of consumers:");
			int numberOfConsumers = Integer.parseInt(scanner.nextLine());
			
			if(numberOfConsumers<=0) // number of consumers should be a positive number
				throw new Exception();
			
			Consumer[] consumer = new Consumer[numberOfConsumers];
			
			System.out.println("\nEnter the consumer details separated by comma");
			for(int i=0;i<numberOfConsumers;i++) {
				System.out.println("Enter details of consumer number "+(i+1));
				String consumerDetails = scanner.nextLine();
				String [] detailsArr = consumerDetails.split(",");
				consumer[i]= new Consumer(detailsArr[0], detailsArr[1], Integer.parseInt(detailsArr[2]));
			}
			
			System.out.println("Cosumer Bills:\n");
			System.out.println(String.format("%-5s %-15s %-5s %-10s","Id","Name","Unit_Consumed","Final_Payment"));
			for(Consumer con : consumer) { // printing the consumer details
				System.out.println(con);
			}
		}
		catch (Exception e) {
			System.out.println("invalid input");
		
		}

	}

}
