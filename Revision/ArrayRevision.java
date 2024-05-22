package Revision;

import java.util.Scanner;

public class ArrayRevision {
    public static void main(String[] args){
        int ar[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the marks of 5 students");
        for(int i = 0; i <ar.length; i++){
            ar[i] = sc.nextInt();
        }
        for(int i =0; i<ar.length; i++){
            System.out.println("Student " + (i+1) + " marks " + ar[i]);
        }
System.out.println("Please enter the number of classes");
int classes = sc.nextInt();
System.out.println("Please enter the number of students in each class");
int studentsCount = sc.nextInt();
        int arr2d[][] = new int[classes][studentsCount];

        for(int i=0; i < arr2d.length; i++){
            System.out.println("Please enter the marks of the student for 2d Array for class " + (i+1));
            for(int j=0; j < arr2d[i].length; j++){
                arr2d[i][j] =sc.nextInt();
            }
        }
        System.out.println("The marks of the students in 2d Array");

        for(int i =0; i < arr2d.length; i++){
            System.out.println("The marks of class no. " + (i+1));
            for(int j=0; j <arr2d[i].length; j++){
                
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
