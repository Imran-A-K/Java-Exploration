package Advanced.Interface;

interface AC {
    void show();
    default void config(){
System.out.println("In config");
    }
    static void init(){
        System.out.println("In init");
    }

}
class BC implements AC{
    public void show(){
        System.out.println("From BC");
    }
    public void config(){
        System.out.println("From BC config");
    }
}

public class Java8Features {
    public static void main(String[] args){
        AC.init();
        BC bc = new BC();
        bc.config();
    }
}
