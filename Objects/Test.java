package Objects;

public class Test {
    int a;
    String name;
    public static void main(String[] args){
        int num = 9; // primitive
        Test obj = new Test(); // reference
        Test obj2 = new Test(); // reference
        obj.name = "First Instance variable";
        System.out.println(obj.a);
        System.out.println(obj.name);
        System.out.println(obj2.a);
        System.out.println(obj2.name);
    }
}

