package me.whiteship.refactoring._21_alternative_classes_with_different_interfaces_rf._21_alternative_classes_with_different_interfaces.interfaces;

import me.whiteship.refactoring._21_alternative_classes_with_different_interfaces.Notification;
import me.whiteship.refactoring._21_alternative_classes_with_different_interfaces.Shipping;

public interface NotificationService {

    void sendNotifications(Shipping shipping);

    void sendNotifications(Notification notification);

}
