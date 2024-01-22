class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");

    }
    void sound(){
        System.out.println("sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks like bow wow");
    }
}

public class dy_me_ds{
    public static void main(String args[]) {
        Animal obj = new Dog(); // Use the type of the superclass
        obj.makeSound(); // Calls the overridden method in the Dog class
        obj.sound();
    }
}
