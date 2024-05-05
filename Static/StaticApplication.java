package Static;

import java.util.Scanner;

class Farmer{
    int principalAmount;
   static float rateOfInterest;
    float timeDuration;
    float simpleInterest;
    static {
rateOfInterest=8.5f;
    }
    void input(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Please mention the amount required ");
        principalAmount = scan.nextInt();
        System.out.println("Please mention time duration ");
        timeDuration=scan.nextFloat();
        
    }
    void compute(){
        simpleInterest=(principalAmount*rateOfInterest*timeDuration)/100f;
    }

    void display(){
      System.out.println("Simple interest is: " + simpleInterest);  
    }

}
public class StaticApplication {
    public static void main(String[] args){
Farmer farmer1 = new Farmer();
Farmer farmer2 = new Farmer();
farmer1.input();
farmer1.compute();
farmer1.display();
farmer2.input();
farmer2.compute();
farmer2.display();
    }
}
