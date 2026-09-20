import java.util.Scanner;

public class condition {
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter  calculator operation: ");
        String operation = sc.next();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        if (operation.equals("+")) {
            System.out.println(a + b);
        } else if (operation.equals("-")) {
            System.out.println(a - b);
        } else if (operation.equals("*")) {
            System.out.println(a * b);
        } else if (operation.equals("/")) {
            System.out.println(a / b);
        } else if (operation.equals("%")) {
            System.out.println(a % b);
        } else {
            System.out.print("Invalid input");
        }
    }
}
