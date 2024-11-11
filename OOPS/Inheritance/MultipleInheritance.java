interface Animal {
    void sound();   // Abstract method
}

interface Mammal {
    void walk();   // Abstract method
}
class Dog implements Animal, Mammal {
    // Overriding the sound() method
    public void sound() {
        System.out.println("Bark");
    }

    // Overriding the walk() method
    public void walk() {
        System.out.println("Walks on four legs");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // Bark
        dog.walk();   // Walks on four legs
    }
}
