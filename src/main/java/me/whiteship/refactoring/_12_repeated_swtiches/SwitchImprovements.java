package me.whiteship.refactoring._12_repeated_swtiches;

public class SwitchImprovements {

    public int vacationHours(String type) {
        int result;
        switch (type) {
            case "full-time": result = 120;
            case "part-time": result = 80;
            case "temporal": result = 32;
            default: result = 0;
        }
        return result;
    }

    /**
     * jdk 17 버젼 변경된 부분
     * switch Expression   기존 swtich statement와 다르다.
     */
    public int vacationHours2(String type) {

        return switch (type) {
            case "full-time" -> 120;
            case "part-time" -> 80;
            case "temporal" ->  32;
            default ->  0;
        };

    }
}
