class Animal {
    void sound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Dog();   // Parent class reference, child class object
        animal.sound();  // Output: Bark (Dog's overridden method)

        animal = new Cat();   // Reassign to Cat
        animal.sound();  // Output: Meow (Cat's overridden method)

        Animal animal1 = new Dog();  // Upcasting
        if (animal1 instanceof Dog) {
            Dog dog = (Dog) animal1;  // Downcasting
            dog.sound();  // Output: Bark
        }
        Animal animal2 = new Cat();  // Upcasting
        if (animal2 instanceof Cat) {
            Cat cat = (Cat) animal2;  // Downcasting
            cat.sound();  // Output: Meow
        }

    }
}
