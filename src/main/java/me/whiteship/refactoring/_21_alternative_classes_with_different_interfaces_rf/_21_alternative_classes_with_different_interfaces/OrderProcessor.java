package me.whiteship.refactoring._21_alternative_classes_with_different_interfaces_rf._21_alternative_classes_with_different_interfaces;

import me.whiteship.refactoring._21_alternative_classes_with_different_interfaces_rf._21_alternative_classes_with_different_interfaces.interfaces.EmailService;

public class OrderProcessor {

    private EmailService emailService;


    public void notifyShipping(Shipping shipping) {
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setTitle(shipping.getOrder() + " is shipped");
        emailMessage.setTo(shipping.getEmail());
        emailMessage.setFrom("no-reply@whiteship.com");
        emailService.sendEmail(emailMessage);
    }

}
