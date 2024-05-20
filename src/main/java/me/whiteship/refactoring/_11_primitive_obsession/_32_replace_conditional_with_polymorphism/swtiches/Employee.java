package me.whiteship.refactoring._11_primitive_obsession._32_replace_conditional_with_polymorphism.swtiches;

import java.util.List;

public abstract class Employee {

    protected List<String> availableProjects;

    public Employee(List<String> availableProjects) {
        this.availableProjects = availableProjects;
    }

    public abstract int vacationHours();

    public abstract boolean canAccessTo(String project);

    /*
    public boolean canAccessTo(String project) {
        return switch (type) {
            case "full-time" -> true;
            case "part-time", "temporal" -> this.availableProjects.contains(project);
            default -> false;
        };
    }*/
}
