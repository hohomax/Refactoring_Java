package me.whiteship.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance;

import java.util.List;

public abstract class Employee {

    private String name;

    private String type;

    protected Employee(String name, String type) {
        this.validate(type);
        this.name = name;
        this.type = type;
    }

    public static Employee createEmployee(String name, String type) throws Exception {

         switch (type){
            case "engineer" : return new Engineer(name, "engineer");

            case "manager" :  return new Manager(name, "manager");

            case "salesman" :  return new SalesMan(name, "salesman");

            default : throw new Exception("not valid type");
        }
    }

    private void validate(String type) {
        List<String> legalTypes = List.of("engineer", "manager", "salesman");
        if (!legalTypes.contains(type)) {
            throw new IllegalArgumentException(type);
        }
    }

    protected String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
