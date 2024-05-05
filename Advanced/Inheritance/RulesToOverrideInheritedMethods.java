package Advanced.Inheritance;
class Animals{
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void age(int age){
        System.out.println("Animal age is: " + age);
    }
}
class Tigress extends Animals{
    @Override
    // you cannot decrease the visiblity of overridden methods
    // return type must match
    public void eat(){
        System.out.println("Tiger is eating");
    }
    // this is just method overloading don't confuse it with overriding of method
    public void age(){
        System.out.println("This is a tiger of age: not given");
    }
}
public class RulesToOverrideInheritedMethods {
    public static void main(String[] args) {
        Tigress tiger = new Tigress();
        tiger.eat();
        
        tiger.age(2);
        // method overloading
        tiger.age();
    }
}
