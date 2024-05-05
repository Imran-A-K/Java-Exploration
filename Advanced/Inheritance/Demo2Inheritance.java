package Advanced.Inheritance;
class Human1{
    private String name;
    int age;
    Human1(){
        System.out.println(" A constructor from human class");
    }
    void eats(){
        age=18;
        System.out.println("I am " + age  + " years old and I am eating");
    }
}
class Student1 extends Human1 
{
    //default constructor included behind the scenes
    // public Student1(){
    //     super();
    // }
    void display(){
        System.out.println("Child class method The age is: " + age);
        // System.out.println("The name is: " + name);
    }
}
public class Demo2Inheritance {
    public static void main(String[] args){
        Student1 s1 = new Student1();
        s1.eats();
        s1.display();
    }
}
