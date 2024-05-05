package Advanced.Inheritance;
class Animal{
    void sleep(){
        System.out.println("Animal is sleeping");
    }
    
}
class Tiger extends Animal{}
class Lion extends Animal{}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        lion.sleep();
        tiger.sleep();
    }
}
