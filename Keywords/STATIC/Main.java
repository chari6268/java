import static java.lang.Math.*;

public class Main {
    static class InnerClass {
        void display() {
            System.out.println("Inside static nested class");
        }
    }
    //static block
    static {
        System.out.println("Static block is called");
    }
    public static void main(String[] args) {
        Counter c1 = new Counter(10);

        Counter.display();

        System.out.println(MathUtil.add(10, 20));
        //creating object of inner class
        InnerClass inner = new InnerClass();
        inner.display();

        double result = sqrt(16);  // No need to use Math.sqrt()
        System.out.println(result); // Output: 4.0

        Example.staticMethod(); // Can call static method without object

        Example obj = new Example();
        obj.instanceMethod(); // Cannot call instance method without object
    }
}
