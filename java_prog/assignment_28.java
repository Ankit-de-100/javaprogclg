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
    int numberOfDoors;

   
    public Car(String brand, int number, int numberOfDoors) {
        super(brand, number); 
        this.numberOfDoors = numberOfDoors;
    }

    public void honk() {
        System.out.println("The " + brand + " is honking.");
    }
}

public class assignment_28 {
    public static void main(String[] args) {
       
        Car myCar = new Car("Toyota", 2022, 4);

        
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Year: " + myCar.number);

     
        myCar.start();
        myCar.stop();

        System.out.println("Number of Doors: " + myCar.numberOfDoors);
        myCar.honk();
    }
}
