package Advanced.Interface;
 interface Computer{
    void compileCode();
 }
 class Desktop implements Computer {
    public void compileCode(){
        System.out.println("Compiling code with Desktop");
    }
 }
 class Laptop implements Computer{
    public void compileCode(){
        System.out.println("Compiling code with Laptop");
    }
 }
 class Developer {
    public void work(Computer c){
        c.compileCode();
    }
 }
public class InterfaceDemo2 {
    public static void main(String[] args){
        Developer d = new Developer();
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

        d.work(desktop);
        d.work(laptop);
    }
}
