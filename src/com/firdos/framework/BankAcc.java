package com.firdos.framework;

public class BankAcc {
	
	    private int accNo;
	    private String accNm;
	    protected float accBal;

	    public BankAcc(int accNo, String accNm, float accBal) {
	        this.accNo = accNo;
	        this.accNm = accNm;
	        this.accBal = accBal;
	    }

	    public void withdraw(float amount) {
	        if (accBal >= amount) {
	            accBal -= amount;
	        } else {
	            System.out.println("Insufficient funds.");
	        }
	    }

	    public void deposit(float amount) {
	        accBal += amount;
	    }

	    @Override
	    public String toString() {
	        return "Account No: " + accNo + ", Account Name: " + accNm + ", Account Balance: " + accBal;
	    }
	}


