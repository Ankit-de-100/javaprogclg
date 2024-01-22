abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("This is a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("This is a rectangle");
    }
}


public class abstract_ex {
    public static void main(String[] args) {
        Circle cir = new Circle();
        Rectangle rec = new Rectangle();
        cir.draw();
        rec.draw();
    }
}
