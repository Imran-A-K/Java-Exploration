package Strings;

public class StringComparision {
    public static void main(String[] args){
         String s1="String"; // Stored in SCP String Constant Pool
        // Stored Directly in Heap Memory
         String s2= new String("String"); // Stored Directly in Heap Memory
//  " References are Compared Output should be false as both references point to different object"
         System.out.println(s1 == s2);
//  " Output should be true as it compares the values not object references"
        System.out.println(s1.equals(s2));

        String s3 = "java";
        String s4 = "java";
        String s5 = "Java";

        System.out.println(s3==s4);
        System.out.println(s3==s5);
        System.out.println(s3.equals(s4));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));
    }
}
