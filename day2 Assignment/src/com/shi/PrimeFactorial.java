package com.shi;

public class PrimeFactorial {

	public static void main(String[] args) {
		
		int n = 12;
		
		String bag = "";
		
		if (n>2 && n<100) {
			
			for (int i=1; i<=n; i++) {
				
				if (n%i == 0) {
					
					bag += i + " ";
				}
			}
			
			System.out.println(bag);
		}
		
		else {
			
			System.out.println("Invalid number");
						
		}

	}

}
