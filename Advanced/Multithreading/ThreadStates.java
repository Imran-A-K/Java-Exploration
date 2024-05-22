package Advanced.Multithreading;
class NormalThread implements Runnable{
    public void run(){
        // Running state
        System.out.println("Normal thread");
try{
    Thread.sleep(1000); //blocked state
    // Dead state
} catch(Exception e){
    System.out.println("Exception occured " + e);
}
System.out.println("Came back to running state");
    }
}
public class ThreadStates {
    public static void main(String[] args) {
        System.out.println("Main thread");
        NormalThread nt = new NormalThread();
        Thread t1 = new Thread(nt); // New state
        t1.start(); // Runnable state
    }
}
