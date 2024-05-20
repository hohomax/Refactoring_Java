package me.whiteship.refactoring._04_long_parameter_list._15_remove_flag_argument;

import java.time.LocalDate;

/**
 * 1. 비지니스 로직이 복잡하면 extract method 로 쪼개기
 * 2. method쪼개면 전달하는 파라미터 수를 줄일수있음.
 */
public class Shipment_리팩토링 {

    public LocalDate deliveryDate(Order order, boolean isRush) {
        if (isRush) {
            return getRushLocalDate(order);
        } else {
            return getNomalLocalDate(order);
        }
    }

    public static LocalDate getNomalLocalDate(Order order) {
        int deliveryTime = switch (order.getDeliveryState()) {
            case "WA", "CA" -> 2;
            case "OR", "TX", "NY" -> 3;
            default -> 4;
        };
        return order.getPlacedOn().plusDays(deliveryTime);
    }

    public static LocalDate getRushLocalDate(Order order) {
        int deliveryTime = switch (order.getDeliveryState()) {
            case "WA", "CA", "OR" -> 1;
            case "TX", "NY", "FL" -> 2;
            default -> 3;
        };
        return order.getPlacedOn().plusDays(deliveryTime);
    }
}
