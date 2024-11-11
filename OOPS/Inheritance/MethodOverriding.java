class Parent{
    void show(){
        System.out.println("Parent's show()");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("Child's show()");
    }
}
public class MethodOverriding{
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
        new Parent().show();
    }
}