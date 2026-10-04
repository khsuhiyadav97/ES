import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i > n; i++){
             n *= i;
        }
        System.out.println(n);

    }
}
