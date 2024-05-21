package me.whiteship.refactoring._17_message_chain._37_hide_delegate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * method.method.method 와 같은 체이닝 메소드일 경우 연결성을 끊어내기
 *    keesun.getDepartment().getManager()
 *    -> keesun.getDepartmentManager() 로 변경
 */

class PersonTest {

    @Test
    void manager() {
        Person keesun = new Person("keesun");
        Person nick = new Person("nick");
        keesun.setDepartment(new Department("m365deploy", nick));

        Person manager = keesun.getDepartment().getManager();
        Person manager2 = keesun.getDepartmentManager();
        assertEquals(nick, manager);
    }

}