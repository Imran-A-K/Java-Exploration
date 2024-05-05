package Advanced.Inheritance;
class Aeroplane{
    public void takeOff(){
        System.out.println("Aeroplane taking off");

    }
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
public class MethodTypesInInheritance {
    public static void main(String[] args){
        CargoPlane cargoPlane = new CargoPlane();
        FighterJet fighterJet = new FighterJet();
        // inherited metods
        cargoPlane.fly();
        fighterJet.fly();

        // Overridden methods
        cargoPlane.takeOff();
        fighterJet.takeOff();

        // Specialized methods
        cargoPlane.carryLoad();
        fighterJet.flyWithStyle();

    }
}
