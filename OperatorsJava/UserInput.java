import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();
        System.out.println("Name "+ name);
        System.out.println("Enter the age");
        int age = scan.nextInt();
        System.out.println("My age is " + age);
        System.out.println("Enter average");
        double avg = scan.nextDouble();
        System.out.println("Average is " + avg);
        scan.close();
    }
}
