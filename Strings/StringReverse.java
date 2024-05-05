package Strings;

public class StringReverse {
  public static void main(String[] args){
    String string1 = "Java Programme";
    String string2 = "";
    
    for(int i=string1.length()-1; i>=0; i--){
        string2 = string2 + string1.charAt(i);
    }
    System.out.println("Before Reversing " + string1);
    System.out.println("After Reversing " + string2);

    // Second type of reversing involving splitting
    String string3 = "";
    String strArr[] = string1.split(" ");

    for(int i=strArr.length -1; i>=0; i--){
        string3 = string3 + strArr[i] +" ";
       }
    
       System.out.println("Before Reversing " + string1);
       System.out.println("After Reversing " + string3);

       String string4 = "";
       for(String element: strArr){
        for(int i=element.length() -1; i>=0; i--){
            string4 = string4 + element.charAt(i);
        }
        string4 = string4 + " ";
       }

       System.out.println("Before Reversing " + string1);
       System.out.println("After Reversing " + string4);

  }  
}
