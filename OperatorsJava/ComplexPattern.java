public class ComplexPattern {
   public static void main(String[] args) {
    int n = 16;
    System.out.println("A");
    for(int i = 0; i<n; i++){
        for(int j= 0; j <n; j++){
        if(i == 0 && j >0 && j< (n-1)/2|| i>0 && j==0|| i ==(n-1)/2 && j<=(n-1)/2 || i>0 && j ==(n-1)/2 ){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        }
    System.out.println();
    }
    System.out.println("--------------------");
    System.out.println("D");
    for(int i = 0; i<n; i++){
        for(int j= 0; j <n; j++){
        if(i == 0 && j< (n-1)/2|| j==0|| i ==(n-1) && j<(n-1)/2 || i>0 && i<(n-1) && j ==(n-1)/2 ){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        }
        for(int j= 0; j <n; j++){
        if(i == 0 && j< (n-1)/2|| j==0|| i ==(n-1) && j<(n-1)/2 || i>0 && i<(n-1) && j ==(n-1)/2 ){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        }
    System.out.println();
    }
  
    System.out.println("--------------------");
    System.out.println("L");
    for(int i = 0; i<n; i++){
        for(int j= 0; j <n; j++){
        if(i == n-1 && j<= (n-1)/2|| j==0){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        }
        for(int j= 0; j <n; j++){
        if(i == n-1 && j<= (n-1)/2|| j==0 ){
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
