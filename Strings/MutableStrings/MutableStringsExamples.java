package Strings.MutableStrings;

public class MutableStringsExamples {
    public static void main(String[] args){
        StringBuffer sbuffer = new StringBuffer();
        StringBuilder sbuilder = new StringBuilder();
        System.out.println(sbuffer.capacity());
        System.out.println(sbuilder.capacity());
        sbuffer.append("abcdefghijklmnop");
        System.out.println(sbuffer.capacity());
        sbuffer.append("q");
        System.out.println(sbuffer.capacity());
       
        StringBuffer sBuffer2 = new StringBuffer("mutable");
        System.out.println(sBuffer2);
        System.out.println(sBuffer2.capacity()); // here the capacity will be 23 because the initial capacity + number of inital words set
        System.out.println(sBuffer2.charAt(1));
        sBuffer2.setCharAt(1, 'U');
        System.out.println(sBuffer2);

        StringBuilder sbuilder2 = new StringBuilder(100);
        System.out.println(sbuilder2.capacity());
        sbuilder2.append("Java");
        sbuilder2.trimToSize();
        System.out.println(sbuilder2.capacity());

        StringBuilder sBuilder3 = new StringBuilder("java");
        System.out.println(sBuilder3.reverse());

    }
}
