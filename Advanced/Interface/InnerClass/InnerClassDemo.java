package Advanced.Interface.InnerClass;
/*
 * there are 3 types of innerclass
 * Member inner class - declared inside a class but separate from any method.
 * Statis inner class - declared with static keyword like static class.
 * Anonymous inner class - declared without class name and implemented interface on the spot.
 */



class A{

    /**
     * InnerInnerClassDemo
     */

     public void show(){
        System.out.println("In show");
     }
    // member inner class
    public class InnerClass {
    public void display(){
        System.out.println("Display from member type inner class");

    }
        
    }
    // static inner class
    public static class staticInnerClass2{
        public void display(){
            System.out.println("Display from static type inner class");
        }
    }
}
public class InnerClassDemo {
    public static void main(String[] args) {
        A obj = new A();
        // A.InnerClass ic = new A().new InnerClass();
        A.InnerClass ic = obj.new InnerClass();
        obj.show();
        ic.display();
        System.out.println("-----------");
        A.staticInnerClass2 sic = new A.staticInnerClass2();
        sic.display();


    }
}
