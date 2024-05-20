package me.whiteship.refactoring._11_primitive_obsession._32_replace_conditional_with_polymorphism.swtiches;

import me.whiteship.refactoring._11_primitive_obsession._32_replace_conditional_with_polymorphism.swtiches.refactoring.FullTimeEmployee;
import me.whiteship.refactoring._11_primitive_obsession._32_replace_conditional_with_polymorphism.swtiches.refactoring.PartTimeEmployee;
import me.whiteship.refactoring._11_primitive_obsession._32_replace_conditional_with_polymorphism.swtiches.refactoring.TemporalTimeEmployee;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void fulltime() {
        Employee employee = new FullTimeEmployee(List.of("spring", "jpa"));
        assertEquals(120, employee.vacationHours());
        assertTrue(employee.canAccessTo("new project"));
        assertTrue(employee.canAccessTo("spring"));
    }

    @Test
    void partime() {
        Employee employee = new PartTimeEmployee("part-time", List.of("spring", "jpa") );
        assertEquals(80, employee.vacationHours());
        assertFalse(employee.canAccessTo("new project"));
        assertTrue(employee.canAccessTo("spring"));
    }

    @Test
    void temporal() {
        Employee employee = new TemporalTimeEmployee("temporal", List.of("jpa"));
        assertEquals(32, employee.vacationHours());
        assertFalse(employee.canAccessTo("new project"));
        assertFalse(employee.canAccessTo("spring"));
        assertTrue(employee.canAccessTo("jpa"));
    }

}