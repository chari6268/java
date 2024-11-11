public class Outer {
    private String outerField = "I am outside!";

    // Inner class
    public class Inner {
        public void display() {
            System.out.println(outerField);  // Inner class can access outer class field
        }
    }
}
