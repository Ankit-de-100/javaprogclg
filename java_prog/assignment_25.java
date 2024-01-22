class AccessDemo {
    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40;

    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    void defaultMethod() {
        System.out.println("This is a default (package-private) method.");
    }

    public void accessPrivateVariable() {
        System.out.println("PrivateVar (from within the class): " + privateVar);
    }
}

class AnotherClass {
    public void accessDemoMethods() {
        AccessDemo obj = new AccessDemo();
        System.out.println("PublicVar: " + obj.publicVar);
        obj.publicMethod();
        obj.defaultMethod();
    }
}

class Subclass extends AccessDemo {
    public void accessProtectedMembers() {
        System.out.println("ProtectedVar (from subclass): " + protectedVar);
        protectedMethod();
    }
}

public class assignment_25 {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        System.out.println("PublicVar: " + obj.publicVar);
        obj.publicMethod();
        obj.accessPrivateVariable();
        System.out.println("DefaultVar: " + obj.defaultVar);
        obj.defaultMethod();

        AnotherClass anotherObj = new AnotherClass();
        anotherObj.accessDemoMethods();

        Subclass subObj = new Subclass();
        subObj.accessProtectedMembers();
    }
}

