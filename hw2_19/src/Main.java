import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double n = scanner.nextDouble();
        double a = n;
        double sum = 0;
        for (double i = 1; i <= n; i = i + 2) {
            sum += 1 / i;
        }

        for (double i = 2; i <= a; i = i + 2) {
            sum -= 1 / i;
        }
        System.out.println(sum);
    }
}