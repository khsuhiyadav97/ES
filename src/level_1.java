import java.util.Scanner;

public class level_1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = sc.nextInt();
//
//        if (num > 0) {
//            System.out.println("Positive");
//        } else if (num < 0) {
//            System.out.println("Negative");
//        } else {
//            System.out.println("Zero");
//        }

        //Even or odd
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        if (num % 2 == 0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
       // }

        //Bigger num

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if (a > b) {
//            System.out.println("a is greater than b");
//        } else if (a < b) {
//            System.out.println(("b is greater than a"));
//        } else  {
//            System.out.println("a and b both are equal");
//        }
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("You can drive");
        } else {
            System.out.println(("You cannot drive"));
        }
    }
}
