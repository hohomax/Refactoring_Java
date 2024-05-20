package me.whiteship.refactoring._06_mutable_data._19_separate_query_from_modifier;

/**
 * 1. getTotalOutstandingAndSendBill 값을 가져오고, 이메일을 보내는 2가지 일을 하는중
 * 2. 각각의 기능으로 역할 분할
 */
public class Billing_리팩토링 {

    private Customer customer;

    private EmailGateway emailGateway;

    public Billing_리팩토링(Customer customer, EmailGateway emailGateway) {
        this.customer = customer;
        this.emailGateway = emailGateway;
    }

    public double getTotalOutstandingAndSendBill() {
        double result = customer.getInvoices().stream()
                .map(Invoice::getAmount)
                .reduce((double) 0, Double::sum);

        return result;
    }

    public void sendBill() {
        emailGateway.send(formatBill(customer));
    }

    private String formatBill(Customer customer) {
        return "sending bill for " + customer.getName();
    }
}
