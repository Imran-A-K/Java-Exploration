package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){
        String string1 = "School Master";
        String string2 = "The Classroom";

        string1 = string1.replace(" ", "").toLowerCase();
        string2 = string2.replace(" ", "").toLowerCase();

        char []arr1 = string1.toCharArray();
        char []arr2 = string2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("It is an Anagram");
        }
        else{
            System.out.println("It's not an anagram");
        }
    }
}
