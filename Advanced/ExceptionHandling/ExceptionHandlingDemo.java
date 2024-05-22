package Advanced.ExceptionHandling;

public class ExceptionHandlingDemo {
    public static void main(String[] args){
        int num1= 6;
        int num2 = 3;
        int result =0;
        int result2 = 0;

        String name =null;

        int values[] = {1,4,5,3};
        try{
             result = num1/num2;
             result2 = num1/name.length();
             System.out.println(values[5]);
         }
        catch(ArithmeticException e){
            System.out.println("Exception occured" + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(values[values.length-1]);
            System.out.println("Array index out of bounds " + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong ");
        }
        System.out.println("Result is "+ result + "Result2 "+ result2);
        System.out.println("Bye");
    }
}
