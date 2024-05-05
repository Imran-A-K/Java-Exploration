package ArrayConstruction;

public class ArrayLength {
    public static void main(String[] args){
        int nums[] = {5,4,5,3};
        int nums2d[][] = {
            {5,4,5,3},
            {2,4,},
            {8,2,3}
        };
        System.out.println(nums.length);
        System.out.println("2d array length " + nums2d.length);
        System.out.println("2d array's first row length " + nums2d[0].length);

        String name = "Imran";
        System.out.println("Length of variabel name which is of string type "+name.length());
    }
    
}
