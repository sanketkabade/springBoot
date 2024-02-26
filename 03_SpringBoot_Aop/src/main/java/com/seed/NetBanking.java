package com.seed;

import org.springframework.stereotype.Component;

@Component
public class NetBanking {

	int balence= 50000;
	
	public void showBalence() {
		System.out.println("online account balence is 35000");
	}
	
	protected double tranceferAmountCaedLess(double amount){
		System.out.println("Amount transferd from net banking ");
		return amount;
		
	}

	public void witdrawAmount(int amount) throws InSufficientFund{
		
		if (balence>amount) {
			System.out.println("Amount witdraw successfully..");
		} else {
			
			throw new InSufficientFund("Insufficient Amount .. can't witdraw");
		}
	}
}
