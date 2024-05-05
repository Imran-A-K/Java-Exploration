package Revision.OOP;

import java.util.Scanner;
abstract class Shape{
 float area;

 public abstract void input(Scanner scan);
 public abstract void compute();
 public abstract void display();

}
class Circle extends Shape {
    float radius;
    
    public void input(Scanner scan){
        System.out.println("Calcuation of Circle");
        System.out.println("please Enter the radius of the Circle");
        radius = scan.nextFloat();
        
    }
    public void compute(){
        area = 3.1416f*radius*radius;
    }
    public void display(){
        System.out.println("Area of Circle: "+ area);
    }

}
class Rectangle extends Shape {
    float length;
    float breadth;
    
    public void input(Scanner scan){
        System.out.println("Calcuation of Rectangle");
        System.out.println("please Enter the length of the Reactangle");
        length = scan.nextFloat();
        System.out.println("Please enter the breadth of the rectangle");
        breadth = scan.nextFloat();
        
    }
    public void compute(){
        area = length*breadth;
    }
    public void display(){
        System.out.println("Area of rectangle: "+ area);
    }

}
class Square extends Shape {
    float length;
    
     
    public void input(Scanner scan){
        System.out.println("Calcuation of Square");
        
        System.out.println("please Enter the length of the Square");
        length = scan.nextFloat();
        

    }
    public void compute(){
        area = length*length;
    }
    public void display(){
        System.out.println("Area of Square: "+ area);
    }

}

class CalculateArea{
    Scanner scan = new Scanner(System.in);
    public void poly(Shape ref){
        ref.input(scan);
        ref.compute();
        ref.display();
    }
}
public class AreaCalculatorApp {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Circle circle = new Circle();
       CalculateArea calculateArea = new CalculateArea();
       calculateArea.poly(rectangle);
       calculateArea.poly(square);
       calculateArea.poly(circle);
        
    }
}
