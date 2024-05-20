package me.whiteship.refactoring._08_shotgun_surgery._27_move_field;

import java.time.LocalDate;

public class CustomerContract {

    private LocalDate startDate;

    private double discountRate;


    public CustomerContract(LocalDate startDate, double discountRate)
    {
        this.startDate = startDate;
        this.discountRate = discountRate;
    }

    public LocalDate startDate() {
        return startDate;
    }

    public double discountRate() {
        return discountRate;
    }

    public CustomerContract setDiscountRate(double discountRate) {
        this.discountRate += discountRate;
        return this;
    }
}
