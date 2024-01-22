class Vehicle {
    String brand;
    int number;

    public Vehicle(String brand, int number) {
        this.brand = brand;
        this.number = number;
    }

    public void start() {
        System.out.println("The " + brand + " is starting.");
    }

    public void stop() {
        System.out.println("The " + brand + " is stopping.");
    }
}

class Car extends Vehicle {
    int doors;

    public Car(int number, String brand, int doors) {
        super(brand, number);
        this.doors = doors;
    }

    public void honk() {
        System.out.println("The " + brand + " is honking.");
    }
}

public class inh {
    public static void main(String[] args) {

        Car myCar = new Car(2022, "Toyota", 4);

        System.out.println("Brand: " + myCar.brand);
        System.out.println("Year: " + myCar.number);

        myCar.start();
        myCar.stop();

        System.out.println("Number of Doors: " + myCar.doors); // Corrected variable name
        myCar.honk();
    }
}
