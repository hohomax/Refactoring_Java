package me.whiteship.refactoring._21_alternative_classes_with_different_interfaces_rf._21_alternative_classes_with_different_interfaces;

import me.whiteship.refactoring._21_alternative_classes_with_different_interfaces.Notification;
import me.whiteship.refactoring._21_alternative_classes_with_different_interfaces.Shipping;
import me.whiteship.refactoring._21_alternative_classes_with_different_interfaces_rf._21_alternative_classes_with_different_interfaces.interfaces.EmailService;
import me.whiteship.refactoring._21_alternative_classes_with_different_interfaces_rf._21_alternative_classes_with_different_interfaces.interfaces.NotificationService;

public class EmailNotificationService implements NotificationService {

    private EmailService emailService;

    @Override
    public void sendNotifications(Shipping shipping) {

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setTitle(shipping.getOrder() + " is shipped");
        emailMessage.setTo(shipping.getEmail());
        emailMessage.setFrom("no-reply@whiteship.com");
        emailService.sendEmail(emailMessage);

    }

    @Override
    public void sendNotifications(Notification notification) {

    }
}
