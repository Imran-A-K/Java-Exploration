package ArrayConstruction;

public class ArrayDemo {
    public static void main(String[] args){
        // int nums[]= {5,4,3,7};
        int nums[] = new int[4];
        nums[0] = 5;
        nums[1]= 4;
        nums[1]= 3;
        nums[1]= 7;
        String names[] = {"Imran", "Irfan", "Affan", "Adnan"};
        for(int i=0;i<=3;i++){

            System.out.println(names[i]);
            System.out.println(nums[i]);
        }
    }
}
