package Strings;

public class ImmutableStringsAndMemoryMap {
    public static void main(String[] args){
        String s1 = new String("String");
        String s2 = new String("String");
        // Output should be false as bot strings are referring to separate objects in the heap memory as because of new keyword
        System.out.println(s1==s2 + "From Direct Heap Memory");

        String s3 = "String";
        String s4 = "String";
        // output should be true as it is referring address from SCP --> String Constant Pool
        System.out.println(s3==s4 + "From String Constant Pool (SCP)");
    }
}
