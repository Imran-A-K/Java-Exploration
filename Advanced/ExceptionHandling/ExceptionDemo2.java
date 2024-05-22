package Advanced.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args){
        int num = 0;
        Scanner input = new Scanner(System.in);
        
        // try with resources
        // try(Scanner input2 = new Scanner(System.in)){
        //     num = input2.nextInt();
        // }
System.out.println("You entered " + num) ;
        try{
            // critical statement
        num = input.nextInt();
        
        }
        catch(InputMismatchException e){
            System.out.println("Please enter a valid decimal number " + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong " + e);
        }
        finally{
            input.close();
        }
        System.out.println("You entered " + num) ;

        
    }
}
