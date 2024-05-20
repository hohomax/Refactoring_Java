package me.whiteship.refactoring._05_global_data._01_before;

public class Thermostats_리팩토링 {

    /**
     *
     * 1. 전역변수는 많은 클래스에서 참조하게되고 변경 될 시 어디서 수정되었는지 찾기어려움.
     * 2.  메소드로 감싸거나(캡슐화해서 메소드로만 접근)
     *     - 내부에서 값에대한 valid체크도 가능
     *     - scope를 제한하며, 어디서 사용되었는지 체크 가능
     * 3.  final 로 선언해서 상수로만 사용하거나
     */

    private static Integer targetTemperature = 70;

    private static Boolean heating = true;

    private static Boolean cooling = false;

    private static Boolean fahrenheit = true;


    public static Integer getTargetTemperature() {
        return targetTemperature;
    }

    public static void setTargetTemperature(Integer targetTemperature) {
        Thermostats_리팩토링.targetTemperature = targetTemperature;
    }

    public static Boolean getHeating() {
        return heating;
    }

    public static void setHeating(Boolean heating) {
        Thermostats_리팩토링.heating = heating;
    }

    public static Boolean getCooling() {
        return cooling;
    }

    public static void setCooling(Boolean cooling) {
        Thermostats_리팩토링.cooling = cooling;
    }

    public static Boolean getFahrenheit() {
        return fahrenheit;
    }

    public static void setFahrenheit(Boolean fahrenheit) {
        Thermostats_리팩토링.fahrenheit = fahrenheit;
    }
}
