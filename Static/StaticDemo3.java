package Static;

class Demo1{
    static int a;
    static int b;

    int m;
    int n;

    static{
        a=10;
        b=20;
        System.out.println("Control in static block");
    }
    // java initialization block
    {
        m=100;
        n=200;
        System.out.println("Control in non-static block");
    }
    static void disp1(){
        System.out.println("Value of static variable a= " + a);
        System.out.println("Value of static variable b= " + b);
    }
     void disp2(){
        System.out.println("Value of instance variable m= " + m);
        System.out.println("Value of instance variable n= " + n);
    }
}

public class StaticDemo3 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        Demo1.disp1();
        d.disp2();
    }
}
