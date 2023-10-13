import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 20; i <= 40; i++) {
            sum += Math.pow(i, 3);
        }
        System.out.println(sum);
    }
}