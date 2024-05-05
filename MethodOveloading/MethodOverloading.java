package MethodOveloading;

class Calc{
public int add(int n1, int n2){
   int result = n1 + n2;
   return result;
}
public int add(int n1, int n2, int n3){
   int result = n1 + n2 + n3;
   return result;
}
public double add(double n1, double n2, double n3){
   double result = n1 + n2 + n3;
   return result;
}
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int result1 = obj.add(4, 3);
        int result2 = obj.add(4, 3, 5);
        double result3 = obj.add(4.4, 3.5, 5.4);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
