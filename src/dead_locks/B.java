package dead_locks;

public class B implements Runnable{

    private final Object monitor1;
    private final Object monitor2;

    public B(Object o1, Object o2){
        monitor1 = o1;
        monitor2 = o2;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (monitor1) {
            System.out.println(name + " took lock on " + monitor1);
            work();
            synchronized (monitor2) {
                System.out.println(name + " here");
            }
        }
        System.out.println(name + " released lock on " + monitor1);
    }
    private void work() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
