public class ThreadSynchronization {
    public static void main(String[] args) {
        MyThread1 t = new MyThread1();
        t.start();
        synchronized (t) {
            try {
                System.out.println("Main thread is waiting...");
                t.wait();
                System.out.println("Main thread is notified...");
                System.out.println(t.total);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread {
    int total = 0;

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("Child thread start execution");
            for (int i = 0; i < 10; i++) {
                total += i;
                System.out.println("Child thread total: " + total);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Child thread end execution");
            this.notify();
        }
    }
}
