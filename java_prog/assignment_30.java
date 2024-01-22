class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }

    void fetch() {
        System.out.println("Dog is fetching.");
    }
}

public class assignment_30 {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.makeSound(); 

        myDog.fetch(); 
        Animal animalRef = myDog;
        animalRef.makeSound(); 
    }
}
