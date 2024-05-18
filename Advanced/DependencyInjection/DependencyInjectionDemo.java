package Advanced.DependencyInjection;
class Student{
    private Heart h; // creating reference
    public Student(Heart heart){
        // constructor with dependency
        this.h = heart;
    }
    public void setH(Heart h){
        // setter method for dependency injection
        this.h = h;
    }
    public void call(){
        h.beat();
    }
}
class Heart {
    public void beat(){
        System.out.println("Heart is beating");
    }
}
public class DependencyInjectionDemo {
    public static void main(String[] args) {
        Heart h = new Heart();
        Student s = new Student(h);
        s.setH(h);
        s.call();
    }
}
