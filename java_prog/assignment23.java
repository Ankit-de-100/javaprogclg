class MyClass {
    int value;

    MyClass(int value) {
        this.value = value;
    }
}

public class assignment23 {
    public static void main(String[] args) {
        MyClass obj = new MyClass(10);
        System.out.println("Before calling modifyObject method: " + obj.value);
        modifyObject(obj);

        System.out.println("After calling modifyObject method: " + obj.value);
    }

    public static void modifyObject(MyClass myObj) {
        myObj.value = 20;
        System.out.println("Inside modifyObject method: " + myObj.value);
    }
}
