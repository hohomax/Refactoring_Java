package me.whiteship.refactoring._10_data_clumps;

public class TelePhoneNumber {

    private String personalAreaCode;

    private String personalNumber;


    public String personalPhoneNumber() {
        return personalAreaCode + "-" + personalNumber;
    }

    public String getPersonalAreaCode() {
        return personalAreaCode;
    }

    public void setPersonalAreaCode(String personalAreaCode) {
        this.personalAreaCode = personalAreaCode;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }


}
