class A{
    public void show(){
        System.out.println("In A");
    }
}
public class over_load_ride extends A{

    // Overriding
    @Override
    public void show(){
        System.out.println("In B");
    }
    // Overloading
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public void add(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

    public static void main(String [] args){
        A obj1 = new A();
        obj1.show();
        over_load_ride obj2 = new over_load_ride();
        obj2.show();
        over_load_ride obj = new over_load_ride();
        obj.add(1, 2);
        obj.add(1, 2, 3);
        obj.add(1, 2, 3, 4);
    }
    
}
