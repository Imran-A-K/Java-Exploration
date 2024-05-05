package Revision;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int jaggedArray[][] = new int[3][];
        jaggedArray[0] = new int[3];
        jaggedArray[1] = new int[2];
        jaggedArray[2] = new int[4];

        for(int i=0; i<jaggedArray.length; i++){
            for(int j=0; j<jaggedArray[i].length; j++){
                System.out.println("Please enter the marks of student " + (j+1) + " of class " + (i+1));
                jaggedArray[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Marks of students are as below");

        for(int i=0; i<jaggedArray.length; i++){
            for(int j=0; j<jaggedArray[i].length; j++){
                System.out.print(jaggedArray[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
 