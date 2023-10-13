import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}