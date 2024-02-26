package com.seed;

import org.springframework.stereotype.Component;
@Component
public class BankService {

	public double showBalence() {
		
		System.out.println("Account balence is 5000");
		
		return 5000.70;
	}
	
	public void transferAmountByDebitCard(int amount) {
		System.out.println("Amount transferd..from BankService");
	}
}
