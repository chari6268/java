public class Person {
    private String name;  // Private field
    private int age;      // Private field

    // Public constructor
    public Person(String name, int age) {
        this.name = name;   // this keyword is used to refer to the current object
        this.age = age;    // this.name refers to the field, name refers to the parameter
    }

    // Public method
    public void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}
