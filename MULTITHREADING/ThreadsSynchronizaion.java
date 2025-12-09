// Create 3 threads updating a shared counter with increment, decrement, and reset logic using synchronization.

class Counter {
    int counter = 0;

    synchronized void increment() {
        System.out.println("increment");
        counter++;
    }

    synchronized void decrement() {
        System.out.println("decrement");
        counter--;
    }

    synchronized void reset() {
        System.out.println("reset");
        counter = 0;
    }
}

public class ThreadsSynchronizaion {
    public static void main(String[] args)throws Exception {
        Counter c = new Counter();
        Thread t1 = new Thread(()->{
            for(int i=0;i<=5;i++){
            c.increment();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0;i<=5;i++){
                c.decrement();
            }
        });
        Thread t3 = new Thread(()->{
            for(int i=0;i<=5;i++){
            c   .reset();
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t1.join(); // if I dont need to do anything after the threads finish (like printing or further logic), .join() will not be used
        t2.join();
        t3.join();
        System.out.println(c.counter);
    }
}