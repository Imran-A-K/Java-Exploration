package Strings;

public class StringInBuitMethods {
    public static void main(String[] args){
        String str="jaVa proG";
        System.out.println(str);
        System.out.println(str.toUpperCase() );
        System.out.println(str.toLowerCase() );
        System.out.println(str.length() );
        System.out.println(str.charAt(6 ) );
        // int length = str.length();
        System.out.println(str.substring(3, 7));
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));
    }
}
