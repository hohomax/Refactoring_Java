package me.whiteship.refactoring._16_temporary_field._36_introduce_special_case;

/**
 * name에 따라 Customer와 unknownCustommer 로 분리
 *
 */
public class UnknownCustommer extends Customer{

    public UnknownCustommer(String name, BillingPlan billingPlan, PaymentHistory paymentHistory) {
        super("unknown", new BasicBillingPlan(), new PaymentHistory(0));
    }

    @Override
    public String getName() {
        return "occupant";
    }

    @Override
    public boolean isKnown() {
        return false;
    }
}
