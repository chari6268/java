abstract class Animal {
    public abstract void sound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Woof");
    }
}