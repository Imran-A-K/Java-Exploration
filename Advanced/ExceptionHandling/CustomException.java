package Advanced.ExceptionHandling;


class MyException extends Exception{
    public MyException(String msg){
        super(msg);  // constructor of parent class called Exception
    }
}
public class CustomException {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = -2;
     
        try{
            if(num2<0){
                // Exception e = new Exception();
                // Exception e = new ArithmeticException("negative number ");
                Exception e = new MyException("negative number ");
                throw e;
                // throw new ArithmeticException("negative number ");
            }
            else{
                int result = num1 / num2;
            System.out.println("Result " + result );
            }
        }
        catch(Exception e){
System.out.println("Enter a valid number " + e);
        }
        
    }
}
