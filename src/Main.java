import java.util.Scanner;
import java.math.MathContext;
public class Main {
    static int power(int a, int b){
            int result=1;
            for (int i = 1; i <= b; i++) {
                result *= a;
            }
            return result;
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = power(base,exponent);
        System.out.println("Sonuç: " + result);

    }
}