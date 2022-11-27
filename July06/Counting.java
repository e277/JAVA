public class Counting extends Thread {
    public static int count = 0;
    public String t_name;

    public Counting(String t_name) {
        this.t_name = t_name;
        System.out.println("Thread: " + t_name + ", Count: " + count);
    }

    public static void main(String[] args) {
        Counting thread1 = new Counting("Thread1");
        Counting thread2 = new Counting("Thread2");
        thread1.start();
        thread2.start();
        System.out.println("Threads start");
        thread1.run();
        thread2.run();
        System.out.println("Threads running");

        while (thread1.isAlive()) {
            count++;
        }
        System.out.println("Count after thread1 is finished: " + count);
    }
}
