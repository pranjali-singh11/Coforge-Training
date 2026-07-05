package Assignments_2July2026;

public class Rectangle extends Shape {

    private double length;
    private double breadth;

    public Rectangle() {
        super();
    }

    public Rectangle(double length, double breadth) {
        super();
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter=" + (2 * (length + breadth)));
    }

    @Override
    public void area() {
        System.out.println("Area=" + (length * breadth));
    }


}