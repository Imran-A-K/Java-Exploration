package Advanced.Multithreading;

class ThreadUser2 implements Runnable{
    public void run(){
        for(int i = 0; i<3; i++){
            System.out.println("In side the seperate thread " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               System.out.println("Exception " + e); 
            }
        }   
    }
}

public class joinAndAliveMethods {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread"
        );
        ThreadUser2 thread1 = new ThreadUser2();
        Thread th1 = new Thread(thread1);
       System.out.println(th1.isAlive()); //false
        th1.start();
        System.out.println(th1.isAlive()); //true
        th1.join();
        System.out.println("Main thread has finished executing"
        );
    }
}
