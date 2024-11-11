class Parent {
    int a = 10;
    void display() {
        System.out.println("Parent class method");
    }
    Parent() {
        System.out.println("Parent class constructor"); // Parent class constructor
    }
}

class Child extends Parent {
    int a = 20;
    void display() {
        super.display();
        System.out.println("Child class method");
    }
    void show() {
        System.out.println("Parent num: " + super.a);
        System.out.println("Child num: "+a);  // Access Parent class variable
    }
}
public class usingSuper {
    public static void main(String[] args) {
        Child c = new Child();
        // Parent class constructor will be called first then Child class constructor
        c.display();
        c.show();
    }
}
