package Advanced.Multithreading;


import java.util.Scanner;

class ThreadUser extends Thread{
   
    public void calc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        sc.close();
        System.out.println("The sum of these numbers " + (num1+num2));
    }
    public void message(){
        System.out.println("Message from the thread");
        try{
         Thread.sleep(2000);
         System.out.println("Focus is important");
        }
        catch(Exception e){
         System.out.println("Exception occured");
        }
    }
    public void run(){
        String currentThread = Thread.currentThread().getName();
        if(currentThread.equals("Thread - Calc")){
        calc();
        }
        else{
        message();
        }
            }
}




public class UsingMultipleThreadsForSingleClass {
    public static void main(String[] args) {
        System.out.println("Main thread");
        
    
        ThreadUser thread1 = new ThreadUser();
        ThreadUser thread2 = new ThreadUser();
        thread1.setName("Thread - Calc");
        thread2.setName("Thread - Message");
        thread1.start();
        thread2.start(); 
       } 
}
