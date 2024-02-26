package com.seed;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ApplicationContext context =  (ApplicationContext) SpringApplication.run(Application.class, args);
	System.out.println("start of main");
	
	BankService service =(BankService)context.getBean(BankService.class);
	service.showBalence();
	//service.transferAmountByDebitCard(59000);
	
	NetBanking netbank = context.getBean(NetBanking.class);
	netbank.showBalence();
	//netbank.tranceferAmountCaedLess(6000);
	try {
		netbank.witdrawAmount(55000);
	} catch (InSufficientFund e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("End of main");
	
	
	
	}

}
