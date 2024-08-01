package com.firdos.framework;

public abstract class SavingAcc extends BankAcc {
    private boolean isSalaried;
    private static final float MINBAL = 1000;

    public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal);
        this.isSalaried = isSalaried;
    }

    @Override
    public void withdraw(float amount) {
        if (accBal - amount >= MINBAL) {
            accBal -= amount;
        } else {
            System.out.println("Cannot withdraw below minimum balance.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Is Salaried: " + isSalaried;
    }
}
