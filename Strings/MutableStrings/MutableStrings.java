package Strings.MutableStrings;

public class MutableStrings {
 public static void main(String[] args){
   StringBuffer sbuffer= new StringBuffer("Imran");
   StringBuilder sbuilder = new StringBuilder("Khan");
//    StringBuffer sb2=""; this syntax in invalid
   System.out.println(sbuffer); 
   System.out.println(sbuilder); 

   sbuffer.append(" Khan");
   sbuilder.append(" Dynasty");
   System.out.println(sbuffer); 
   System.out.println(sbuilder); 

 }   
}
