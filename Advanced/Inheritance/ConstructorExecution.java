package Advanced.Inheritance;

class Parent // extends Object
 {
    int a, b;
    public Parent(){
        // super(); included by default by compiler 
        System.out.println("Parent class zero parameterized cnstructor");
    }
    public Parent(int x, int y){
        // super(); included by default by compiler
        this.a = x;
        this.b = y;
        System.out.println("Parent class Parametrized Constructor");
    }
}

class Child extends Parent{
    int m , n;
    public Child(){
        // super(); included by default by compiler
        // super(10,20);
        this(10,20);
        System.out.println("Child class non-parameterized constructor");
    }
    public Child(int x, int y){
        // super(); included by default by compiler
      // super(5,6);
        this.a = x;
        this.b = y;
        System.out.println("Child class parameterized constuctor");
    }
}
public class ConstructorExecution {
    public static void main(String[] args){
        Child child = new Child();
        // Child child2 = new Child(4,5);
    }
}
