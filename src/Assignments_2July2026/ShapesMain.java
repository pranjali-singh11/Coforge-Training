package Assignments_2July2026;

public class ShapesMain {
    public static void main(String[] args) {
           Shape s=new Square(2);
           s.perimeter();
           s.area();

           s=new Circle(2.1);
           s.perimeter();
           s.area();

           s=new Rectangle(2,4);
           s.perimeter();
           s.area();


    }
}
