package MethodOveloading;

class Calc{
public void show(int n){
    System.out.println("int " + n);
}
public void show(double n){
    System.out.println("double " + n);
}
public void show(byte n){
    System.out.println("byte " + n);
}
public void show(short n){
    System.out.println("short " + n);
}
public void show(char n){
    System.out.println("char " + n);
}
}

public class AutomaticPromotionInOverloading {
    public static void main(String[] args) {
        Calc obj = new Calc();
        byte b = 4;
        obj.show(b);
        obj.show('s');
    }
}
