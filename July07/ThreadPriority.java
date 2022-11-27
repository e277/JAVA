public class ThreadPriority extends Thread {
    public static void main(String[] args) {
        ThreadPriority p1 = new ThreadPriority();
        ThreadPriority p2 = new ThreadPriority();
        p1.start();
        p2.start();
        p1.setPriority(2);
        p2.setPriority(1);
        int p = p1.getPriority();
        int p22 = p2.getPriority();
        System.out.println("first thread priority : " + p);
        System.out.println("second thread priority : " + p22);
    }

    public void run() {
        System.out.println("Thread Running... " + Thread.currentThread().getName());
    }
}
