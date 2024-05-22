package Advanced.Multithreading;

import java.util.Scanner;

class Calculate extends Thread{
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
class Message extends Thread{
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
public class THreadCreationDemo2 {
  public static void main(String[] args) {
    System.out.println("Main thread");
    ThreadUser c = new ThreadUser();
    Message m = new Message();
    c.start();
    m.start(); // this will be executed first
  }  
}
