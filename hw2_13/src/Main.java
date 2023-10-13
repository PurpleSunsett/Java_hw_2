import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double sr_ar = 0;
        int kol = 0;
        for (int i = a; i <= b; i++) {
            sr_ar += i;
            kol += 1;
        }
        System.out.println(sr_ar / kol);
    }
}
//все 4 пункта можно сделать сразу через a и b, просто подставляя нужные числа вместо a или b, поэтому написал один общий