package Strings;

public class Palindrome {
    public static void main(String[] args){
        String string1 = "MADAM";
        String string2 = "";

        for(int i = string1.length() -1; i>=0; i--){
            string2 = string2 + string1.charAt(i);
        }

        if(string1.equals(string2)){
            System.out.println("This is a palindrome string");
        }
        else{
            System.out.println("This is not a palindrome string");
        }
    }
}
