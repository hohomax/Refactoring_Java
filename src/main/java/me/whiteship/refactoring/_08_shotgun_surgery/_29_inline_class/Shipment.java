package me.whiteship.refactoring._08_shotgun_surgery._29_inline_class;

public class Shipment {

    private String shippingCompany;

    private String trackingNumber;

    public Shipment(String shippingCompany, String trackingNumber) {
        this.shippingCompany = shippingCompany;
        this.trackingNumber = trackingNumber;
    }


    public String shippingCompany() {
        return shippingCompany;
    }

    public Shipment setShippingCompany(String shippingCompany) {
        this.shippingCompany = shippingCompany;
        return this;
    }

    public String trackingNumber() {
        return trackingNumber;
    }

    public Shipment setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }

    public String getTrackingInfo(){

        return shippingCompany+": "+trackingNumber;

    }
}
