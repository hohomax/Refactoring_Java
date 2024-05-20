package me.whiteship.refactoring._07_divergent_change._26_extract_class;

/**
 *  필드의 성질에 따라 별도 클래스로 분리(office 클래스 )
 *  person 에서는 office의 메소드만 가져와서 사용하도록 변경
 */
public class Person {

    private final String name;
    private final Office office;

    public Person(String name, Office office) {
        this.name = name;
        this.office = office;
    }

    public String name() {
        return name;
    }

    public String telePhoneNumber(){

        return office.telephoneNumber();

    }
}
