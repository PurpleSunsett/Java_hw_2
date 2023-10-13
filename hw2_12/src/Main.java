import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int proizv = 1;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++){
            proizv *= i;
        }
        System.out.println(proizv);
    }
}