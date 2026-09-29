import java.util.*;

public class LoopPracSet3 {
    public static void main(String[] args){

        Random rand = new Random();
        int boundedInt = rand.nextInt(100);

        System.out.println("Enter the number from 0 to 99: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while (a != boundedInt) {

            if (a > boundedInt) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }

            System.out.println("Try again: ");
            a = sc.nextInt();
        }

        System.out.println("Correct! 🎉");



    }
}
