package me.whiteship.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance;



public class SalesMan extends Employee {


    public SalesMan(String name, String type) {
        super(name, type);
    }

    @Override
    public String getType(){
        return "salesMan";
    }
}
