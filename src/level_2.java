import java.util.Scanner;

public class level_2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int marks = sc.nextInt();
//
//        if (marks <= 100 && marks >= 90) {
//            System.out.println("A");
//        } else if (marks < 90 && marks >= 80) {
//            System.out.println("B");
//        } else if (marks < 80 && marks >= 70) {
//            System.out.println("C");
//        } else if (marks < 70 && marks >= 60) {
//            System.out.println("D");
//        } else {
//            System.out.println("F");
//        }

          //Calculator
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the first number: ");
//        int first_num = sc.nextInt();
//        System.out.print("Enter the expression: ");
//        String expression = sc.next();
//        System.out.print("Enter the second number: ");
//        int second_num = sc.nextInt();
//
//        if (expression.equals("+")) {
//            System.out.println(first_num + second_num);
//        } else if (expression.equals("-")) {
//            System.out.println(first_num - second_num);
//        } else if (expression.equals("*")) {
//            System.out.println(first_num * second_num);
//        } else if (expression.equals("/")) {
//            System.out.println(first_num / second_num);
//        }

        //Largest of three

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        if (a > b && a > c) {
//            System.out.println("a is the largest");
//        } else if (b > c) {
//            System.out.println("b is the largest");
//        } else {
//            System.out.println("c is the largest");
//        }
        int n = 10;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }
    }
}
