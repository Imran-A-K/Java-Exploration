package Advanced.Multithreading;

class ThreadUser3 implements Runnable{
    public void run(){
        for(int i=0; i<3; i++){

            System.out.println("Inside seperate thread " + i);
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println(" Thread interupted " + e);
            }
        }
    }
}

public class InteruptThread {
    public static void main(String[] args){
        ThreadUser3 tU1 = new ThreadUser3();
        Thread t1 = new Thread(tU1);
        t1.start();
        t1.interrupt();
        
    }
}
