import java.util.Scanner;

public class level_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//        }
//        System.out.println("""
//                Menu:
//                1- Pizza
//                2- Pasta
//                3- Burger
//                4- Exit
//                """);
//        System.out.println("Enter the number of item:");
//        int num = sc.nextInt();
//
//        switch (num) {
//            case 1:
//                System.out.println("Pizza");
//                break;
//            case 2:
//                System.out.println("Pasta");
//                break;
//            case 3:
//                System.out.println("Burger");
//                break;
//            case 4:
//                System.out.println("Goodbye!");
//                break;
//            default:
//                System.out.println("Sorry, We're out of this you can have the glass of water only 10 dollars Hahaha");
//        }
        System.out.println("""
                You can enter one of these traffic light mentioned below|-
                Red
                Yellow
                Green
                """);
        System.out.println("Enter the traffic light: ");
        String Traffic_light = sc.next();
        if (Traffic_light != null) {
            switch (Traffic_light){
                case "red":
                    System.out.println("Stop");
                    break;
                case "yellow":
                    System.out.println("Get ready");
                    break;
                case "green":
                    System.out.println("Go");
                    break;
                default:
                    System.out.println("You entered wrong input");
            }
        }
    }
}
