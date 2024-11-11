class Calculator {
    // Method with one parameter
    int add(int a) {
        return a + 5;
    }

    // Method with two parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with different parameter types
    double add(double a, double b) {
        return a + b;
    }
}
public class Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5));        // Calls add(int)
        System.out.println(calc.add(5, 10));    // Calls add(int, int)
        System.out.println(calc.add(5.5, 10.5)); // Calls add(double, double)
    }
}
