import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int sum2 = 0;
        for (int i = 100; i < 501; i++) {
            sum += i;
        }
        System.out.println(sum);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++){
            sum2 += i;
        }
        System.out.println(sum2);
    }
}