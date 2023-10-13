import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = n; i <= 2 * n; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}