public class Main {
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    public static void main(String[] args) {
        // Creating an instance of ClassName
        ClassName obj = new ClassName(10, "Hello World");
        System.out.println("\nUsing instance of ClassName");  // Printing the object
        // Calling a method on the object
        obj.displayInfo();

        // Creating an instance of Person
        Person person = new Person("John", 25);
        System.out.println("\nUsing instance of Person");  // Printing the object
        person.introduce();  // Calling a method on the object

        // Creating an instance of Counter
        Counter.increment();  // Calling a static method
        System.out.println("\nUsing instance of Counter");  // Printing the object
        System.out.println(Counter.count);  // Accessing a static variable

        // Creating an instance of Outer
        Outer outer = new Outer();
        System.out.println("\nUsing instance of Outer");  // Printing the object
        Outer.Inner inner = outer.new Inner();  // Creating an instance of Inner
        inner.display();

        // Creating an instance of Dog
        Animal dog = new Dog();
        System.out.println("\nUsing instance of Dog");  // Printing the object
        dog.sound();
        dog.sleep();

        // Creating an instance of FinalClass
        System.out.println("\nUsing instance of FinalClass");  // Printing the object
        new FinalClass();
        FinalClass finalClass = new FinalClass(120, "John Doe");
        finalClass.display();

        // Using enum
        Day day = Day.MONDAY;
        System.out.println("\nUsing enum");
        System.out.println(day);
        
    }
}
