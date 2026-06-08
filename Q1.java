abstract class Shape {
    abstract void area(double r, double b);
    // abstract void area(double l,double b);
}

class Circle extends Shape {
    @Override
    void area(double r, double b) {
        System.out.println("The circle Area is :  " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    void area(double l, double b) {
        System.out.println("The Rectangle area is : " + (l * b));
    }
}

public class Q1 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area(5, 1);
        Rectangle r = new Rectangle();
        r.area(4, 5);
    }

}
