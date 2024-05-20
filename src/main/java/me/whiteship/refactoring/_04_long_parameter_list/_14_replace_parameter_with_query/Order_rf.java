package me.whiteship.refactoring._04_long_parameter_list._14_replace_parameter_with_query;

/**
 *
 * 1. 임의의 변수를 생성해서 처리하지말고 제거 가능하면 제거하자
 * 2. 메소드에 전달하는 매개변수는 가능한 줄인다 최대 3 가능하다면 1개로 줄이자.
 */
public class Order_rf {

    private int quantity;

    private double itemPrice;

    public Order_rf(int quantity, double itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double finalPrice() {
        return this.discountedPrice(this.quantity * this.itemPrice);
    }

    private int getDiscountLevel() {
        return this.quantity > 100 ? 2 : 1;
    }

    private double discountedPrice(double basePrice) {
        return getDiscountLevel() == 2 ? basePrice * 0.90 : basePrice * 0.95;
    }
}
