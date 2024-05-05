package Advanced.FinalKeyword;
class Aeroplane{
    final int plane = 20;
    public void takeOff(){
        System.out.println("Aeroplane taking off");

    }
    final public void fly(){
        // final type variable cannot reassigned with value
        // plane = 22;
        System.out.println("Aeroplane is flying");
    }
}

class FighterJet extends Aeroplane{
    // final method cannot be overridden in child class 
    // public void fly(){
    //     System.out.println("Aeroplane is flying");
    // }
}

public class FinalKeyword {
   public static void main(String[] args) {
    
   } 
}
