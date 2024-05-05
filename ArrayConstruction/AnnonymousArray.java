package ArrayConstruction;

class Calculate{
    public int add(int x, int y){
        int result = x + y;
        return result;
    }
    public int arrayNumbersSum(int arr[]){
        int result = 0;
        for(int num : arr){
            result = result + num;
        }
        return result;
    }
}

public class AnnonymousArray {
    public static void main(String[] args){
        
        Calculate obj = new Calculate();
        int result = obj.add(10, 3);
        int arrayNumbersSum = obj.arrayNumbersSum(new int[]{ 5,4,3,2,1}); // Annonymous Array
        System.out.println("Result of a Calculate class object method addition " + result);
        System.out.println("Result of a Calculate class object method sum of array numbers " + arrayNumbersSum);
    }
}
