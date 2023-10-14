import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double N = scanner.nextDouble();
        double vpered = 0;
        double nazad = 0;
        for (double i = 1; i <= N; i++) {
            if (i % 2 == 1) {
                vpered += 1 / i;
            } else {
                nazad += 1 / i;
            }
        }
        System.out.println(vpered - nazad + " км от дома будет мужчина после 100 этапа");
        System.out.println(vpered + nazad + " км пройдет мужчина");
    }
}