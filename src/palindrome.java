import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        System.out.println("Enter a integer number to check if a number is palindrome or not: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = a;

        int digit = 0;
        int reverse =0;
        while (n > 0){
            digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;

        }
        if (a == reverse){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
