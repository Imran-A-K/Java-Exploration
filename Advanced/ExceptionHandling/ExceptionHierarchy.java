package Advanced.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHierarchy {
    public static void main(String[] args) {
        // unchecked exception
        int num = 7/0;
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // checked exception
        try {
            String str = br.readLine();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        
    } 
}
