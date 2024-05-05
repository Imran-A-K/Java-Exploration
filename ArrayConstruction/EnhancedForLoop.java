package ArrayConstruction;

public class EnhancedForLoop {
    public static void main(String[] args) {
    //     int nums[] = {5,4,7,8};
    // for(int n : nums){
    //     System.out.println(n);
    // }
    int nums[][] = {
        {5,2,3,6},
        {8,3, 5, 4},
        {9,4,8, 2}
    };
    for(int a[] : nums){
        for( int b : a){
System.out.print(b + " ");
        }
        System.out.println();
    }
    }
}
