
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class assignment21 {
    public static void main(String[] args) {
       
        Person person = new Person("Alice", 30);

      
        System.out.println("Before modification:");
        displayPersonInfo(person);

       
        modifyAge(person, 35);

        
        System.out.println("\nAfter modification:");
        displayPersonInfo(person);
    }

    
    public static void displayPersonInfo(Person person) {
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }

    
    public static void modifyAge(Person person, int newAge) {
        person.age = newAge;
    }
}
