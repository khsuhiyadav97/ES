import java.util.Scanner;

public class level4 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if (a == b) {
//            System.out.println(a + " and " + b +" both are equal");
//        } else if (a < b) {
//            System.out.println(a + " is less than " + b);
//        } else {
//            System.out.println(a + " is greater than " + b);
//        }
        System.out.println("Enter the temperature in Celsius");
        int temp = sc.nextInt();

        if (temp < 0) {
            System.out.println("Freezing");
        } else if (temp <= 15 ) {
            System.out.println("Cold");
        } else if (temp <= 30) {
            System.out.println("Normal");
        } else {
            System.out.println("Hot");
        }
    }
}

