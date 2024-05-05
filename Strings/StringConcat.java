package Strings;

public class StringConcat {
    public static void main(String[] args){
        String s1 = new String("Immutable String");
        s1.concat(" concat");
        System.out.println(s1);
        s1 = s1.concat(" concat this will work because s1 is now referring to the latest string");
        System.out.println(s1);

        String s3 = "Java";
        String s4 = s3.concat(" Programme --> this will be added directly in Heap Memory outside of SCP because we are using references or any in built methods");
        String s5 = new String("Java");
        s5 = s3.concat(" another string");
        System.out.println(s4);
        System.out.println(s5);

        // using + operator to concat

        // this will be stored at SCP
        String s6 = "java" + "Programme";
        
        // this will be stored in direct heap memory as we are using references to concat + operator is not an Inbuilt method
        String s7 = s6 + s6;

        System.out.println(s7);
    }
}
