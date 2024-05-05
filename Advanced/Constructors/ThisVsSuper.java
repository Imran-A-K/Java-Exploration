package Advanced.Constructors;
class Student1{ // extends Object
    private String name;
    private int age;

    public Student1(){
        // super();
        this("Affan",22);
        System.out.println("Default Constructor is called");
        name="Irfan";
        age=22;
    }
    public Student1(String name){
        this();
        this.name=name;
        age=23;
    }
    public Student1(String name, int age){
       this.name=name;
       this.age=age;
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class ThisVsSuper {
  public static void main(String[] args){
    Student1 student1 = new Student1();
    student1.display();
    Student1 student2 = new Student1("Imran");
    student2.display();
  }  
}
