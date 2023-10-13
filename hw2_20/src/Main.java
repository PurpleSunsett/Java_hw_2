import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double sum = 0;
        for (double i = 1; i <= 11; i = i + 2){
            sum += Math.pow(x, i) / i;
        }
        System.out.println(sum);
    }
}
//x = 2