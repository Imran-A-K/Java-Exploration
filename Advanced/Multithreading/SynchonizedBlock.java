package Advanced.Multithreading;
class SyncBlockVehicle implements Runnable{
     public void run(){
       try {
        System.out.println(Thread.currentThread().getName() + " has entered parking lot");
        Thread.sleep(2000);
 synchronized(this){
    System.out.println(Thread.currentThread().getName() + " got into the vehicle");
    Thread.sleep(2000);
    System.out.println(Thread.currentThread().getName() + " started driving");
    Thread.sleep(2000);
    System.out.println(Thread.currentThread().getName() + " came back and parked the vehicle");
}
       } catch (Exception e) {
        System.out.println("Exeption has occured " + e);
       } 
    }
}
public class SynchonizedBlock {
    public static void main(String[] args) {
        SyncBlockVehicle car = new SyncBlockVehicle();
        Thread t1 = new Thread(car);
        Thread t2 = new Thread(car);
        Thread t3 = new Thread(car);
t1.setName("Imran");
t2.setName("Irfan");
t3.setName("Affan");
        t1.start();
        t2.start();
        t3.start();
    }  
}





