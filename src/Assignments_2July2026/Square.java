package Assignments_2July2026;

public class Square extends Shape {

        private double side;

        public Square() {

        }
        public Square(double side) {
            this.side = side;
        }
        @Override
        public void perimeter() {
        System.out.println("Perimeter = " + 4 * side);
        }
        @Override
        public void area() {
            System.out.println("Area = " + side * side);
        }


}

