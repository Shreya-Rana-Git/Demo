package org.anudip.javabean;

import java.text.DecimalFormat;

public class BillService {  
	// function to calculate the bill
	public static String billCalcultion(Consumer consumer) {
		
		int unitConsumed = consumer.getUnitConsumed();
		DecimalFormat df = new DecimalFormat("#.00");
		double payment = 0.0;
		
		if(unitConsumed<=200) {
			payment=300.00;
			return df.format(payment);
		}
		else if(unitConsumed>=201 && unitConsumed<=500) {
			payment=300.00+((unitConsumed-200)*1.25);
			return df.format(payment);
		}
		else if(unitConsumed>=501 && unitConsumed<=1000) {
			payment=300.00+(300*1.25)+((unitConsumed-500)*1.00);
			return df.format(payment);
		}
		else {
			payment=300.00+(300*1.25)+(500*1.00)+((unitConsumed-1000)*0.75);
			return df.format(payment);
		}
		
	}
}
