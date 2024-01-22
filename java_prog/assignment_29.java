class Animal {
    String species;

    public Animal(String species) {
        this.species = species;
    }

    public void makeSound() {
        System.out.println("The " + species + " makes a sound.");
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String species, String breed) {
        super(species); 
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        super.makeSound(); 
        System.out.println("The " + breed + " dog barks.");
    }

    public void fetch() {
        System.out.println("The " + breed + " dog is fetching.");
    }
}

public class assignment_29 {
    public static void main(String[] args) {      
        Dog myDog = new Dog("Canine", "Golden Retriever");
        System.out.println("Species: " + myDog.species);
        myDog.makeSound();
        System.out.println("Breed: " + myDog.breed);
        myDog.fetch();
    }
}
