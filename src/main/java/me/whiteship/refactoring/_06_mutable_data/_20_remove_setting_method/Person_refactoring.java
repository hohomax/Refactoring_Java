package me.whiteship.refactoring._06_mutable_data._20_remove_setting_method;

/**
 * 리팩토링 20.  세터 제거하기
 * - 세터를 제공한다는 것은 해당 필드가 변경 될수 있다는것을 뜻한다.
 *  - 세터가 반드시 필요한것인지 판단
 *  - 필요없다면 생성자에 변수로 넣어두고 setter메소드는 삭제.
 */
public class Person_refactoring {

    public Person_refactoring(int id) {
        this.id = id;
    }

    private String name;

    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
