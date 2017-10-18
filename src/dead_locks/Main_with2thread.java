package dead_locks;
public class Main_with2thread {


    public static void main(String[] args) throws InterruptedException {
        Object obj1 = new Object();
        Object obj2 = new Object();

        Thread t1 = new Thread(new A(obj1, obj2), "t1");
        Thread t2 = new Thread(new B(obj1, obj2), "t2");

        t1.start();
        t2.start();
    }
}
