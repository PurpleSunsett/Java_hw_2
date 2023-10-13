import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double sum = 1;
        for (double i = 2; i <= 11; i++) {
            if (i % 2 == 0) {
                sum -= Math.pow(x, i - 1) * i / (i + 1);
            } else {
                sum += Math.pow(x, i - 1) * i / (i + 1);
            }
        }
        System.out.println(sum);
    }
}
//x = 2