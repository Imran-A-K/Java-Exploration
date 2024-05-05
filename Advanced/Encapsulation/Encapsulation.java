package Advanced.Encapsulation;

 class Student
{
    private int age;
    private String name;

   

 public void setAge(int age) {
        this.age = age;
    }



    public void setName(String name) {
        this.name = name;
    }



public int getAge() {
        return age;
    }



    public String getName() {
        return name;
    }



public void show(){
   System.out.println("Name: " + name + " Age " + age);
 }
}

public class Encapsulation {
    public static void main(String[] args){
        Student obj = new Student();
        Student obj2 = new Student();
        
        obj.setName("Imran");
        obj.setAge(26);
        int student1Age = obj.getAge();
        String student1Name = obj.getName();
        System.out.println( "Student 1 Name: "+ student1Name);
        System.out.println( "Student 1 Age: "+ student1Age);
        obj.show();
        obj2.setName("Ahmed");
        obj2.setAge(27);
        obj2.show();
    } 
}
