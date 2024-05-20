package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object;

import java.util.List;

public class Priority {

    private String value;

    private final List<String> priorityList = List.of("low","normal","high","rush");

    public Priority(String value) {

        if(priorityList.contains(value))
            this.value = value;
        else
            throw new IllegalArgumentException("value is not valid");

    }

    private int checkHigherThanValue(String value){

        return priorityList.indexOf(value);
    }



    @Override
    public String toString() {
        return value;
    }
}
