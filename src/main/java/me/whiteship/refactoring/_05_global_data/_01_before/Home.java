package me.whiteship.refactoring._05_global_data._01_before;

public class Home {

    public static void main(String[] args) {
        System.out.println(Thermostats.targetTemperature);
        Thermostats.targetTemperature = -1111600;
        Thermostats.fahrenheit = false;


        Thermostats_리팩토링.getTargetTemperature();
        Thermostats_리팩토링.getCooling();
        Thermostats_리팩토링.getFahrenheit();

    }
}
