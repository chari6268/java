class Animal{
    Animal(){
        System.out.println("Constructor of Animal class");
    }
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    Dog(){
        super();    // Calls the constructor of the parent class
    }
    void eat(){
        System.out.println("Dog is eating");
    }
    void bark(){
        System.out.println("Dog is barking");
    }
    void work(){
        super.eat();    // Calls the eat() method of the parent class
        bark();
    }
}
public class ConstructorInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.work();
    }
}
