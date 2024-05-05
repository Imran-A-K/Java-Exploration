package Strings.MutableStrings;

public class FinalVsImmutability {
  public static void main(String[] args){
    final int a= 10;
    // a=20; invalid because of final
    System.out.println(a);

    final StringBuffer fStrBuffer = new StringBuffer("Imran");
    fStrBuffer.append(" Ahmed");
    // fStrBuffer = new StringBuffer("dsd");invalid because of final
    System.out.println(fStrBuffer);
  }  
}
