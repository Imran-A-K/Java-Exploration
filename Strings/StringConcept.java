package Strings;

public class StringConcept {
    public static void main(String[] args){
        String brand = "This is an Immutable String";
        System.out.println(brand);

        brand.concat("Concat");
        System.out.println(brand);

        StringBuilder brand1 = new StringBuilder("This is an Mutable String");
        System.out.println(brand1);

        brand1.append(" Concat");
        System.out.println(brand1);
    }
}
