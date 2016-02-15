package ProjectEuler;

import java.util.Scanner;

public class LargestPrime {
	
	public static void main (String [] args) {
		
		System.out.print("Enter a positive number: ");
		
		Scanner newScan = new Scanner (System.in);
		
		double n = newScan.nextDouble();
		
		double count;
		
		for (double i=2; i <= n; i++) {
			
			count = 0;
			
			while (n % i == 0) {
				
				n /= i;
				
				count++;
			}
			if (count == 0) {
				
				continue;
				
			}
			System.out.println (i + "**" + count);
		}
		
		
	}

}
