package me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PersonTest {

    @Test
    void test(){

        String number = "123";
        String areaCode = "02";

        TelephoneNumber telephoneNumber = new TelephoneNumber(areaCode, number);
        TelephoneNumber telephoneNumber2 = new TelephoneNumber(areaCode, number);

        TelephoneNumber_record telephoneNumber_record = new TelephoneNumber_record(areaCode, number);

        assertEquals("02", telephoneNumber_record.areaCode());
        assertEquals("123", telephoneNumber_record.number());
        assertNotEquals(telephoneNumber, telephoneNumber_record);


    }

}
