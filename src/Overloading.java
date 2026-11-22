

public class Overloading {
    public static void main() {
        func(2, 3);
        func("Anisha");
    }
    static int func(int num1, int num2){
        return num1 + num2;
    }
    static String func(String a){
        String s = "Hello" + a;
        return s;
    }
}
