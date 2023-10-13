public class Main {
    public static void main(String[] args) {
        double sum = 0;
        for (double i = 2; i <= 10; i++) {
            sum += i/(i+1);
        }
        System.out.println(sum);
    }
}