package Advanced.Polymorphism;
class Aeroplane2{
    public void takeOff(){
        System.out.println("Aeroplane taking off");

    }
    public void fly(){
        System.out.println("Aeroplane is flying");
    }
}

class FighterJet2 extends Aeroplane2{
    @Override
    public void takeOff(){
        System.out.println("Fighter Jet taking off with afterburner");
    }
    public void flyWithStyle(){
        System.out.println("Fighter Jets flies with style");
    }
}
class CargoPlaneNew extends Aeroplane2{
    @Override
    public void takeOff(){
      System.out.println("Cargo plane is taking off");  
    }
    public void carryLoad(){
        System.out.println("Cargo plane is carrying load");
    }
}
class PassengerPlane extends Aeroplane2{
    @Override
    public void takeOff(){
      System.out.println("Passenger plane is taking off");  
    }
    public void carryLoad(){
        System.out.println("Passenger plane is carrying load");
    }
}

class Airpport{
    public void poly(Aeroplane2 ref){
        ref.fly();
        ref.takeOff();

        System.out.println("-----------------");
    }
}
public class Polymorhism {
    public static void main(String[] args) {
        // you can also write Aeroplane cargoPlane = new CargoPlaneNew(); because Aeroplane is parent class
        CargoPlaneNew cargoPlane = new CargoPlaneNew();
        PassengerPlane passengerPlane = new PassengerPlane();
        FighterJet2 fighterJet = new FighterJet2();
        Airpport airport = new Airpport();
// runtime polymorphism
        airport.poly(cargoPlane);
        airport.poly(passengerPlane);
        airport.poly(fighterJet);

    }
}
