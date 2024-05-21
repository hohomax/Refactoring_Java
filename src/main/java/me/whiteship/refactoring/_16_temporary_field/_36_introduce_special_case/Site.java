package me.whiteship.refactoring._16_temporary_field._36_introduce_special_case;

public class Site {

    private Customer customer;

    public Site(Customer customer) {

        this.customer = customer.getName().equals("unknown") ?
                new UnknownCustommer("unknown",null,null) : customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
