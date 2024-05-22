package Advanced.Multithreading;

class MyThread extends Thread{
    public void run(){
        System.out.println("Current thread ");
        System.out.println("Current thread name " + Thread.currentThread().getName() );
        System.out.println("Current thread priority " + Thread.currentThread().getPriority() );
    }
}

public class ThreadCreationDemo {
    public static void main(String[] args) {
        System.out.println("Main thread the line of execution ");
        MyThread t = new MyThread();
        t.start();
    }
}
