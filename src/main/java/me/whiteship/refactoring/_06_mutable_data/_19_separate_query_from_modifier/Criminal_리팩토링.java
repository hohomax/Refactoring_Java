package me.whiteship.refactoring._06_mutable_data._19_separate_query_from_modifier;

import java.util.List;

/**
 * 2가지일을 동시에 하는 alertForMiscreant 메소드 분리
 * 1. don과 john을 찾음
 * 2. 알람을 끔
 *
 * 개선방법:
 * - 하나는 modifiery로 void메소드로 alertForMiscreant
 * - 다른 메소드는 단순 don과 john을 찾는용도
 */
public class Criminal_리팩토링 {

    public void alertForMiscreant(List<Person> people) {

        if(!findForMiscreant(people).isBlank())
            setOffAlarms();
    }

    public String findForMiscreant(List<Person> people) {
        for (Person p : people) {
            if (p.getName().equals("Don")){
                setOffAlarms();
                return "Don";
            }

            else if (p.getName().equals("John")) {
                setOffAlarms();
                return "John";
            }
        }
        return "";
    }

    private void setOffAlarms() {
        System.out.println("set off alarm");
    }
}
