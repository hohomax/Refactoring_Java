package me.whiteship.refactoring._10_data_clumps;

public abstract class Employee {

    private String name;
    private String type;

    public Employee(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract String getType();
}
