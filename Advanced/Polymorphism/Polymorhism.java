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
class PassengerPlane extends Aeroplane{
    @Override
    public void takeOff(){
      System.out.println("Passenger plane is taking off");  
    }
    public void carryLoad(){
        System.out.println("Passenger plane is carrying load");
    }
}

class Airpport{
    public void poly(Aeroplane ref){
        ref.fly();
        ref.takeOff();

        System.out.println("-----------------");
    }
}
public class Polymorhism {
    public static void main(String[] args) {
        // you can also write Aeroplane cargoPlane = new CargoPlane(); because Aeroplane is parent class
        CargoPlane cargoPlane = new CargoPlane();
        PassengerPlane passengerPlane = new PassengerPlane();
        FighterJet fighterJet = new FighterJet();
        Airpport airport = new Airpport();
// runtime polymorphism
        airport.poly(cargoPlane);
        airport.poly(passengerPlane);
        airport.poly(fighterJet);

    }
}
