interface Bicycle {
    void draw(); // Abstract method declaration

    void area(); // Another abstract method
}

class Circle implements Bicycle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the draw method from the Bicycle interface
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    // Implementing the area method from the Bicycle interface
    @Override
    public void area() {
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + circleArea);
    }
}

// Implement the interface in another class
class Rectangle implements Bicycle {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the draw method from the Bicycle interface
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    // Implementing the area method from the Bicycle interface
    @Override
    public void area() {
        double rectangleArea = length * width;
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}

public class interface {
    public static void main(String[] args) {
        // Create instances of classes implementing the Bicycle interface
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Call methods from the interface
        circle.draw();
        circle.area();

        rectangle.draw();
        rectangle.area();
    }
}
