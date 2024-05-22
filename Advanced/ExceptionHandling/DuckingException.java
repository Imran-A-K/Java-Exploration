package Advanced.ExceptionHandling;
class Demo{
    void a () throws Exception
    {
//         try{
//             b();
//         }
//         catch(Exception e){
// System.out.println("Exception occured " + e);
//         }

    b();
    }
    void b() throws Exception{
int num1 = 4;
int num2 = 0;
int result = 0;

    result = num1/num2;
    System.out.println("Result " + result);

    }
}
public class DuckingException {
    public static void main(String[] args){
        Demo d = new Demo();
       try{

           d.a();
       }
       catch(Exception e){
        System.out.println("Exception occured " + e);
       }
    }
}
