class test{
    // static Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }
}
class Book{
    String title;
    int cost;

    // Constructor
    public Book(String title, int cost) {
        this.title = title;
        this.cost = cost;
    }
    // Default Constructor
    public Book(){}
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void Display() {
        System.out.println("Title: " + title);
    }
    public int getCost() {
        return cost;
    }
    public void show(){
        System.out.println("Title: " + title + " Cost: " + cost);
    }
}
public class main{
    public static void main(String[] args) {
        // passing values to the method and printing the result
        Book book = new Book("Java", 100);
        book.show();

        // Default Constructor
        Book book1 = new Book();
        book1.setTitle("Python");
        book1.setCost(200);
        book1.show();

        // Static Method
        System.out.println("Sum: " + test.add(10, 20));



    }
}