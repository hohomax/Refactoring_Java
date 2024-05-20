package me.whiteship.refactoring._07_divergent_change._26_extract_class;

public class Office {
    private final String officeAreaCode;
    private final String officeNumber;


    public Office(String officeAreaCode, String officeNumber) {
        this.officeAreaCode = officeAreaCode;
        this.officeNumber = officeNumber;
    }

    public String telephoneNumber() {
        return this.officeAreaCode + " " + this.officeNumber;
    }

    public String officeAreaCode() {
        return officeAreaCode;
    }

    public String officeNumber() {
        return officeNumber;
    }

}