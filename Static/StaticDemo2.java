package Static;
class Demo{
    static void disp1(){
        System.out.println("static display - 1");
    }
    void disp2(){
        System.out.println("Non static disp 2");
    }
}
public class StaticDemo2 {

    public static void main(String[] args){
        Demo.disp1();// static members are object independent
        // Demo.disp2();// disp2 is non static
        
        Demo d = new Demo();
         d.disp2();
         
    }
}
