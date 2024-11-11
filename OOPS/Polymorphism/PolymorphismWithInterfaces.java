interface Animal {
    void sound();
}

interface Mammal {
    void walk();
}

class Dog implements Animal, Mammal {
    public void sound() {
        System.out.println("Bark");
    }

    public void walk() {
        System.out.println("Dog walks on four legs");
    }
}

public class PolymorphismWithInterfaces {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();  // Output: Bark

        Mammal mammal = new Dog();
        mammal.walk();   // Output: Dog walks on four legs
    }
}
