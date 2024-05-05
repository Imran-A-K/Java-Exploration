public class Ternary {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 40;

        boolean result = (a < b) ? true : false;
        System.out.println("a is less than b ? " + result);
        String res = a<b ? "a is less than b" : "b is less than a";
        System.out.println(res);

        int smallestNumber = (a < b) ? (a < c ? a : c)  : ( b < c ? b : c) ;
        System.out.println(smallestNumber + " --> smallest number ");
    }
}