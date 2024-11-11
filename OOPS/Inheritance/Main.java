class Parent {
    void print(String b) {
        System.out.println("This is the Parent class.From "+b);
    }
}

class Child extends Parent {
    void print() {
        System.out.println("This is the Child class.");
        print("Child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        c.print();
        c.print("Main, using Child Object");

        Parent p = new Parent();
        p.print("using Parent Object");
    }
}
