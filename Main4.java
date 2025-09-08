class Shape {
    double area() {
        return 0.0;
    }
}

class Circle extends Shape {
    double radius = 7;

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    double area() {
        return length * width;
    }
}

public class Main4 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        System.out.println("Circle Area: " + s1.area());
        System.out.println("Rectangle Area: " + s2.area());
    }
}
