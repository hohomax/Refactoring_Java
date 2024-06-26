package me.whiteship.refactoring._08_shotgun_surgery._27_move_field;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Customer {

    private String name;

    private CustomerContract contract;

    public Customer(String name, double discountRate) {
        this.name = name;
        this.contract = new CustomerContract(dateToday(), discountRate);
    }

    public void becomePreferred() {
        contract.setDiscountRate(0.03);
        // 다른 작업들
    }

    public double applyDiscount(double amount) {
        BigDecimal value = BigDecimal.valueOf(amount);
        return value.subtract(value.multiply(BigDecimal.valueOf(contract.discountRate()))).doubleValue();
    }

    private LocalDate dateToday() {
        return LocalDate.now();
    }
}
