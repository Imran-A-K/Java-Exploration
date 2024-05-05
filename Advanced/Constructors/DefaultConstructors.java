package Advanced.Constructors;

class Demo{
    private int a;
    private int b;
    private int c;

// This default constructor is added automatically behind the scenes
    // public Demo(){

    // }

    public Demo(){
        System.out.println("Zero parameterized constructor");
    }
    public Demo(int a, int b){
        this.a = a;
        this.b = b;
    }
    public Demo(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
    }
}

public class DefaultConstructors {
    public static void main(String[] args){
        Demo demo = new Demo(10, 20, 30);
        demo.display();
        Demo demo2 = new Demo();
        demo2.display();

    }
}
