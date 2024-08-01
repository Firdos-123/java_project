package com.firdos.main;
import com.firdos.Application.*;
import com.firdos.framework.*;
import java.util.Scanner;

public class AccountUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        
	        BankFactory bankFactory = new MMBankFactory();

	       
	        SavingAcc savingAcc = bankFactory.getNewSavingAcc(101, "Faiz", 5000, true);
	        CurrentAcc currentAcc = bankFactory.getNewCurrentAcc(102, "Fatima", 2000, 1000);

	    
	        System.out.print("Enter amount to withdraw from Saving Account: ");
	        float savingWithdrawAmount = scanner.nextFloat();
	        System.out.print("Enter amount to withdraw from Current Account: ");
	        float currentWithdrawAmount = scanner.nextFloat();

	        savingAcc.withdraw(savingWithdrawAmount);
	        currentAcc.withdraw(currentWithdrawAmount);

	        System.out.println(savingAcc.toString());
	        System.out.println(currentAcc.toString());

	        scanner.close();
	    }
	}


