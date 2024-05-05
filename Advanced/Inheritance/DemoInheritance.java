package Advanced.Inheritance;
class Human{ //parent // super // base class
    int age;
    void eats(){
        age=18;
        System.out.println("I am " + age  + " years old and I am eating");
    }
}
class Student extends Human // child / sub / derived class
{

}
public class DemoInheritance {
   public static void main(String[] args){
    Student s1 = new Student();
    s1.eats();
   } 
}
