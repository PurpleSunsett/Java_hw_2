import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        int max = 0;
        int num = 0;
        for (int i = a; i <= b; i++) {
            for (int j = i -1; j > 1; j--) {
                if (i % j == 0){
                    sum += j;
                }
            if (sum > max){
                max =sum;
                num = i;
            }
            }
        }
    System.out.println(num);
    }
}