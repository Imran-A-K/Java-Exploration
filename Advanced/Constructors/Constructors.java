package Advanced.Constructors;

class Student
{
    private int age;
    private String name;

   public Student(String name, int age){
    this.name = name;
    this.age = age;
   }

//  public void setAge(int age) {
//         this.age = age;
//     }



//     public void setName(String name) {
//         this.name = name;
//     }



public int getAge() {
        return age;
    }



    public String getName() {
        return name;
    }




}


public class Constructors {
    public static void main(String[] args){
        Student obj = new Student("Imran", 26);
        
        
       
        int student1Age = obj.getAge();
        String student1Name = obj.getName();
        System.out.println( "Student 1 Name: "+ student1Name);
        System.out.println( "Student 1 Age: "+ student1Age);
     
    }
}
