package Advanced.Interface.InnerClass;

@FunctionalInterface
 interface Car {
void drive(int speed);
    
}
interface Lamborghini{
void driveLambo(int speed, int topSpeed);
}


public class AnnonymousInnerClass {
    public static void main(String[] args){
        // Car c = new Car(){
        //     public void drive(){
        //         System.out.println("Driving anonymously...");
        //     }
        // };
        Car c = (int speed)-> System.out.println("Driving with lambda expresion at " + speed + " miles");
        Car c2 =  speed -> System.out.println("Driving with lambda expresion at " + speed + " miles");
        
        c.drive(60);
        c2.drive(70);

        Lamborghini l = (speed, topSpeed) -> {
            System.out.println( "Driving Lambo anonymously at " + speed + " mph with top speed of " + topSpeed + " mph");
        };
        l.driveLambo(70,100);
    }
}
