package Advanced.Multithreading;

public class ThreadDemo {
    public static void main(String[] args){
        System.out.println("Main thread");
        String currentThread = Thread.currentThread().getName();
        System.out.println("Before changing");
        System.out.println("Current thread " + currentThread);
        System.out.println("Current thread priority  " +Thread.currentThread().getPriority());

        System.out.println("After changing");

        Thread t = Thread.currentThread();
        t.setName("Default Thread");
        t.setPriority(1);
        String currentThread2 =  Thread.currentThread().getName();

        System.out.println("Current thread " + currentThread2 );
        System.out.println("Current thread priority "+ Thread.currentThread().getPriority());
    }
}
