package Strings;

public class Pangram {
   public static void main(String[] args){

    boolean flag=false;
    String string = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
    // step 1 remove white spaces and convert to either uppercase or lowercase
    string = string.replace(" ", "").toUpperCase();
    // string = string.replace(" ", "").toLowerCase();

    
    // step 2 convert to char type array
    char []characters = string.toCharArray();
    // step 3 create an empty array of total alphabet size
    int allAlphbetsArray[] = new int[26];
    // step 4 filling the allCharacters array to enter if the characters are present
    for(int i=0; i<characters.length; i++){
       
        allAlphbetsArray[characters[i] -65]++; // appending the paticuar index with 1
        // allAlphbetsArray[characters[i] -'a']++; // you have to use this for lower case
    }
    
    for(int i =0; i<allAlphbetsArray.length ; i++){
        if(allAlphbetsArray[i] ==0){
            flag=true;
        }

    }
    if(flag==false) System.out.println("It's pangram");
    else System.out.println("It's not pangram");


   } 
}
