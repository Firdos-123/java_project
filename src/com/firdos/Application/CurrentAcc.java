package com.firdos.Application;
import com.firdos.framework.*;

class MMCurrentAcc extends CurrentAcc {
    public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal, creditLimit);
    }

    @Override
    public String toString() {
        return "MMCurrentAcc: " + super.toString();
    }
}

