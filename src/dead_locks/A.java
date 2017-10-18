package dead_locks;

public class A implements Runnable{
    private Object monitor1;
    private Object monitor2;

    public A(){
    }

    public A(Object o1, Object o2){
        this.monitor1=o1;
        this.monitor2=o2;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (monitor2) {
            System.out.println(name + " took lock on " + monitor2);
            work();
            synchronized (monitor1) {
                System.out.println(name + " here");
            }
        }
        System.out.println(name + " released lock on " + monitor1);
    }
    private void work() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void deadLock() throws InterruptedException {
        synchronized(this){
            this.wait();
        }
    }
}