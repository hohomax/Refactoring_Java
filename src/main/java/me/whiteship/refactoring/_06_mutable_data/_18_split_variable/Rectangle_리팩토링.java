package me.whiteship.refactoring._06_mutable_data._18_split_variable;

public class Rectangle_리팩토링 {

    private double perimeter;
    private double area;

    public void updateGeometry(double height, double width) {
        double perimeter = 2 * (height + width);
        System.out.println("Perimeter: " + perimeter);
        this.perimeter = perimeter;

        area = height * width;
        System.out.println("Area: " + area);
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }
}
