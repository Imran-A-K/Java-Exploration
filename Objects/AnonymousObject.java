package Objects;
class Annonymous{
    void disp(){
        System.out.println("Calling annoymous object");
    };
}
public class AnonymousObject {
    public static void main(String[] args) {
        new Annonymous().disp();
    }
}
