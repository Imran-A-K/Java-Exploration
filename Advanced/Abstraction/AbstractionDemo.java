package Advanced.Abstraction;
abstract class Aeroplane{
   abstract public void takeOff();
   // 100% abstraction is not achieved
   public void fly(){
        System.out.println("Aeroplane is flying");
    }
}

class FighterJet extends Aeroplane{
    @Override
    public void takeOff(){
        System.out.println("Fighter Jet taking off with afterburner");
    }
    public void flyWithStyle(){
        System.out.println("Fighter Jets flies with style");
    }
}
class CargoPlane extends Aeroplane{
    @Override
    public void takeOff(){
      System.out.println("Cargo plane is taking off");  
    }
    public void carryLoad(){
        System.out.println("Cargo plane is carrying load");
    }
}

public class AbstractionDemo {
   public static void main(String[] args) {
    Aeroplane cp = new CargoPlane();
    Aeroplane fj = new FighterJet();

    fj.takeOff();
    // temporary down casting
    ((FighterJet) fj).flyWithStyle();
    cp.takeOff();
   } 
}
