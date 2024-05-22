package Advanced.Multithreading;

import java.util.Scanner;

class Calculate implements Runnable{
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the firt number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        sc.close();
        System.out.println("The sum of these numbers " + (num1+num2));
    }
}
class Message implements Runnable {
    public void run(){
        System.out.println("Message from the thread");
       try{
        Thread.sleep(2000);
        System.out.println("Focus is important");
       }
       catch(Exception e){
        System.out.println("Exception occured");
       }
    }
}
public class ThreadWithRunnableInterface {
   public static void main(String[] args) {
    System.out.println("Main thread");
    Calculate c = new Calculate();
    Message m = new Message();

    // registering with threads for thread scheduler
    Thread t1 = new Thread(c);
    Thread t2 = new Thread(m);
     
    t1.start();
    t2.start(); // this will be executed first
   } 
}
