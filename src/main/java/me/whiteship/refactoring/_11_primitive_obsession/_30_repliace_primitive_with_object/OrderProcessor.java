package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

import java.util.List;

public class OrderProcessor {

    public long numberOfHighPriorityOrders(List<Order> orders) {

        return orders.stream()
                .filter(o -> o.getPriorityValue() == "high" || o.getPriorityValue() == "rush")
                .count();
    }
}
