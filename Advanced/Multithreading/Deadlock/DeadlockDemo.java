package Advanced.Multithreading.Deadlock;
class Library implements Runnable{
    String resource1 = new String("Java");
    String resource2 = new String("C++");
    String resource3 = new String("DSA");
    
    public void run(){

                String name = Thread.currentThread().getName();
                if(name.equals("Student 1")){
                    try {
                        Thread.sleep(3000);
                        synchronized(resource1){
                            System.out.println("Student 1 has acquired book - " + resource1);
                            Thread.sleep(3000);
                            synchronized(resource2){
                                System.out.println("Student 1 has acquired book - " + resource2);
                                Thread.sleep(3000); 
                                synchronized(resource3){
                                    System.out.println("Student 1 has acquired book - " + resource3);
                                    Thread.sleep(3000);
                                }  
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Some Problem");
                    }
                }
                else{
                    try {
                        Thread.sleep(3000);
                        synchronized(resource3){
                            System.out.println("Student 2 has acquired book - " + resource3);
                            Thread.sleep(3000);
                            synchronized(resource2){
                                System.out.println("Student 2 has acquired book - " + resource2);
                                Thread.sleep(3000); 
                                synchronized(resource1){
                                    System.out.println("Student 2 has acquired book - " + resource1);
                                    Thread.sleep(3000);
                                }  
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Some Problem");
                    }
                }
    
                     }

 }
public class DeadlockDemo {
   public static void main(String[] args) {
    Library lib = new Library();
    
    Thread t1 = new Thread(lib);
    Thread t2 = new Thread(lib);

    t1.setName("Student 1");
    t2.setName("Student 2");

    t1.start();
    t2.start();
   } 
}
