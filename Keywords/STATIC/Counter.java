public class Counter {
    static int count = 0;
    Counter(int a) {
        this.count += a;
    }

    static void display() {
        System.out.println("Count: " + count);
    }
}
