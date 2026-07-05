package Assignments_2July2026;

public class Circle extends Shape {

    private double radius;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    @Override
    public void perimeter() {
        System.out.println("Perimeter: " + (2 * 3.14 * radius));
    }

    @Override
    public void area() {
        System.out.println("Area: " + (3.14 * radius * radius));
    }

}