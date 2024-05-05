public class Pattern3 {
    public static void main(String[] args) {
        int n = 8;
        System.out.println("Square");
        for(int i = 0; i<n; i++){
            for(int j= 0; j <n; j++){
            if(i== 0|| j == 0|| i== n-1|| j == n-1 ){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
        System.out.println();
        }
        System.out.println("--------------------");
        System.out.println("A");
        for(int i = 0; i<n; i++){
            for(int j= 0; j <n; j++){
            if(i== 0|| j == 0|| j == n-1|| i== (n-1)/2 ){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
        System.out.println();
        }
        System.out.println("--------------------");
        System.out.println("H");
        for(int i = 0; i<n; i++){
            for(int j= 0; j <n; j++){
            if(j == 0|| j == n-1|| i== (n-1)/2 ){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
        System.out.println();
        }
        System.out.println("--------------------");
        System.out.println("I");
        for(int i = 0; i<n; i++){
            for(int j= 0; j <n; j++){
            if(i == 0|| i == n-1|| j== (n-1)/2 ){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
        System.out.println();
        }
        System.out.println("--------------------");
        System.out.println("E");
        for(int i = 0; i<n; i++){
            for(int j= 0; j <n; j++){
            if(i == 0|| i == n-1|| i== (n-1)/2|| j==0 ){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
        System.out.println();
        }
        System.out.println("--------------------");
        System.out.println("F");
        for(int i = 0; i<n; i++){
            for(int j= 0; j <n; j++){
            if(i == 0|| i== (n-1)/2|| j==0 ){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
        System.out.println();
        }
        System.out.println("--------------------");
        System.out.println("I");
    }
}
