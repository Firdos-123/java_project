package com.firdos.framework;

public abstract class CurrentAcc extends BankAcc {
    private float creditLimit;

    public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(float amount) {
        if (accBal + creditLimit >= amount) {
            accBal -= amount;
        } else {
            System.out.println("Cannot withdraw beyond credit limit.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Credit Limit: " + creditLimit;
    }
}

