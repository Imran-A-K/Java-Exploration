package Advanced.Inheritance;
class Demo1{
  void disp(){
    System.out.println("Disp method written in Demo1 class");
  }
}
class Demo2 extends Demo1{}
class Demo3 extends Demo2{}
public class MultipleInheritance {
    public static void main(String[] args){
        Demo3 demo3 = new Demo3();
        demo3.disp();
    }   
}
