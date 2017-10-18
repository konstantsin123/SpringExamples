package dead_locks;

public class Main_with1thread {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        a.deadLock();
    }
}
