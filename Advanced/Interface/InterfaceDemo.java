package Advanced.Interface;
interface A {
    int number = 4;
    void show();
}
interface B{
    void display();
    void show();
}
class C  implements AC,B{
    public void show(){
        System.out.println("show");
    }
    public void display(){
        System.out.println("display");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println(A.number);// because variable is static
         C c = new C();
         c.display();
         c.show(); 
    }
}
