// Create three threads with different priorities and observe execution order.
class t1 extends Thread{
    @Override
    public void run() {
        System.out.println("t1 running");
    }
}
class t2 extends Thread{
    @Override
    public void run() {
        System.out.println("t2 running");
    }
}
class t3 extends Thread{
    @Override
    public void run() {
        System.out.println("t3 running");
    }
}
public class ThreadsPriority {
    public static void main(String[] args) {
        t1 o1 = new t1();
        t2 o2 = new t2();
        t3 o3 = new t3();
        o1.setPriority(1);  // max
        o2.setPriority(5);
        o3.setPriority(10);   // min
        o1.start();
        o2.start();
        o3.start();
        System.out.println(o1.getPriority());
        System.out.println(o2.getPriority());
        System.out.println(o3.getPriority());
    }
}
