package me.whiteship.refactoring._21_alternative_classes_with_different_interfaces_rf._21_alternative_classes_with_different_interfaces;

import me.whiteship.refactoring._21_alternative_classes_with_different_interfaces_rf._21_alternative_classes_with_different_interfaces.interfaces.AlertService;

public class OrderAlerts {

    private AlertService alertService;
    
    public void alertShipped(Order order) {
        AlertMessage alertMessage = new AlertMessage();
        alertMessage.setMessage(order.toString() + " is shipped");
        alertMessage.setFor(order.getEmail());
        alertService.add(alertMessage);
    }
}
