package Static;

public class StaticDemo {
   static int age; //first

   static{ //second
    age=12;
    System.out.println("Static block");
    System.out.println(age);
   }
   static void disp(){ //third
    System.out.println("Static display method will execute after main after we call it");
   }
    public static void main(String[] args){
        System.out.println("Main method");
        disp();
    }
}
