package ArrayConstruction;

public class Array2d {
    public static void main(String[] args){
        // int nums[][] = new int[3][2];
        // nums[0][0] = 5;
        // nums[0][1] = 2;
        // nums[1][0] = 8;
        // nums[1][1] = 3;
        // nums[2][0] = 9;
        // nums[2][1] = 4;
        // for(int i =0; i<=2; i++){
        //     for(int j=0; j<=1; j++ ){
        //       System.out.print(nums[i][j] + " ");  
        //     }
        //     System.out.println();
        // }

        // ------------
        int nums[][] = {
            {5,2,3,6},
            {8,3},
            {9,4,8}
        };
        // loop for normal and jagged arrays
        for(int i =0; i<=2; i++){
            for(int j=0; j<nums[i].length; j++ ){
              System.out.print(nums[i][j] + " ");  
            }
            System.out.println();
        }
        // --------------------

        // directly for jagged arrays
            // int nums [][] = new int[3][];
            // nums[0] = new int[4];
            // nums[1] = new int[2];
            // nums[2] = new int[3];
    }
}
