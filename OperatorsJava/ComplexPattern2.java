public class ComplexPattern2 {
  public static void main(String[] args) {
    int n =19;
    System.out.println("--------------------");
    System.out.println("Diagonal");
    for(int i = 0; i<n; i++){
        for(int j= 0; j <n; j++){
        if(i==j){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        }
        System.out.print(" ");
        for(int j= 0; j <n; j++){
            if(i==j || i+j==n-1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
        
    System.out.println();
    }
    System.out.println("--------------------");
    System.out.println("Diagonal2");
    for(int i = 0; i<n; i++){
        for(int j= 0; j <n; j++){
        if(i==j || i+j==n-1|| i==0|| j==0|| i==n-1|| j==n-1){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        }
        
        System.out.print("  ");
        for(int j= 0; j <n; j++){
            if(i==j || i+j==n-1|| i==0|| j==0|| i==n-1|| j==n-1 || i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2|| i+j==((n-1)+(n-1)/2)){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
            System.out.print("  ");
        for(int j= 0; j <n; j++){
            if(i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2|| i+j==((n-1)+(n-1)/2)){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
            System.out.print("  ");
        for(int j= 0; j <n; j++){
            if(i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2|| i+j==((n-1)+(n-1)/2) || i==0|| j==0|| i==n-1|| j==n-1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
        System.out.println();

    }
    System.out.println("--------------------");
    
    
  }  
}
