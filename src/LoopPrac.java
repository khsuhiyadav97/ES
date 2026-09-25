import java.util.*;

public class LoopPrac {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for (int i = 10; i >= 1; i--){
//            System.out.println(i);
//        }
//        System.out.println("Blast off! Happy birthday!");

        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}
