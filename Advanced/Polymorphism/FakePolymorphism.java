package Advanced.Polymorphism;
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
public class FakePolymorphism {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        FighterJet fj = new FighterJet();

        Aeroplane ref;

        ref=cp;
        ref.takeOff();
        ref.fly();

        System.out.println("---------------------");
        ref=fj;
        ref.takeOff();
        ref.fly();
    }
}
