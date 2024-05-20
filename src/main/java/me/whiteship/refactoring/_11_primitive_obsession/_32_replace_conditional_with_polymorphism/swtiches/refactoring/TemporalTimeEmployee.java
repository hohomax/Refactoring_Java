package me.whiteship.refactoring._11_primitive_obsession._32_replace_conditional_with_polymorphism.swtiches.refactoring;

import me.whiteship.refactoring._11_primitive_obsession._32_replace_conditional_with_polymorphism.swtiches.Employee;

import java.util.List;

public class TemporalTimeEmployee extends Employee {
    public TemporalTimeEmployee(String type, List<String> availableProjects) {
        super(availableProjects);
    }

    @Override
    public int vacationHours() {
        return 32;
    }

    @Override
    public boolean canAccessTo(String project) {
        return availableProjects.contains(project);
    }

}
