package me.whiteship.refactoring._07_divergent_change._24_split_phase;

/**
 * 1.복잡한 수식에 대한 내용을 계산 타입에 따라 펑션 분리.
 * 2.Record클래스를 통해 냄새나는 (매개변수 4개) 를 줄이기위해 PriceData Record 클래스 생성
 * 3.Record타입 클래스에 basePrice, discount, quantity 등 매개변수 생성자 매개변수 전달
 * 4. calculatePrice에서는 전달된 PriceData(record class) 의 값 이용하여 메소드 처리
 */
public class PriceOrder_rf {

    public double priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {
        
        final double basePrice = product.basePrice() * quantity;
        
        final double discount = Math.max(quantity - product.discountThreshold(), 0)
                * product.basePrice() * product.discountRate();

        final PriceData priceData = new PriceData(basePrice, discount, quantity);
        return calculatePrice(priceData, shippingMethod);

    }

    private static double calculatePrice(PriceData priceData, ShippingMethod shippingMethod) {

        final double shippingPerCase = (priceData.basePrice() > shippingMethod.discountThreshold()) ?
                shippingMethod.discountedFee() : shippingMethod.feePerCase();

        final double shippingCost = priceData.quantity() * shippingPerCase;

        return priceData.basePrice() - priceData.discount() + shippingCost;
    }
}
