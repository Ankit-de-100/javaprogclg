class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class poly {
    public static void main(String[] args) {
        // Polymorphism achieved through method overriding
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        // Call draw method - actual implementation is determined at runtime
        shape1.draw();  // Calls draw method in Circle class
        shape2.draw();  // Calls draw method in Rectangle class
    }
}

