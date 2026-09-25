import java.util.Scanner;

public class loops {
    public static void main(String[] args){
        // 1 to 20 numbers print using for loop
//        for (int i = 1; i <= 20; i++) {
//            System.out.println(i);

        //even number between 1 to 50
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            if (i % 2 == 0){
                System.out.print(i);
            }
            System.out.print(" ");



        }
    }
}
