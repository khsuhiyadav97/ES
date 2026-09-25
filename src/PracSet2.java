import java.util.Scanner;

public class PracSet2 {
    public static void main(String[] args){
        //SUM of numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n:");
        int n = sc.nextInt();
        int sum = 0;

//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        System.out.print("Sum of the n numbers is " + sum);
        // Factorial
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;

        }
        System.out.println("Factorial of n number is: " + fact);
    }
}
