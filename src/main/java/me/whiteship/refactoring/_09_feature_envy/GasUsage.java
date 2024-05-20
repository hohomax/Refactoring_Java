package me.whiteship.refactoring._09_feature_envy;

public class GasUsage {

    private double amount;

    private double pricePerUnit;

    public GasUsage(double amount, double pricePerUnit) {
        this.amount = amount;
        this.pricePerUnit = pricePerUnit;
    }

    public double getAmount() {
        return this.amount;
    }

    public double pricePerUnit() {
        return pricePerUnit;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double gasBill() {
        return getAmount() * pricePerUnit();
    }

}
