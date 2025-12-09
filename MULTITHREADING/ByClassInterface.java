// Make threads using both ways by interface and by class.

class ByClass extends Thread {
    public void run() {
        System.out.println("Running in thread: " + Thread.currentThread().getName());
    }
}
class ByInterface implements Runnable {
    public void run() {
        System.out.println("Task running in: " + Thread.currentThread().getName());
    }
}
public class ByClassInterface {
    public static void main(String[] args) {
        ByClass t1 = new ByClass();
        Thread t2 = new Thread(new ByInterface());
        t1.start(); // starts a new thread (calls run() automatically)
        t2.start();
    }
}