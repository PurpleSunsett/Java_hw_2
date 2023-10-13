public class Main {
    public static void main(String[] args) {
        double sum = 0;
        int size = 0;
        for (double i = 1; size <= 8 ; i = i/3, size++){
            sum += i;
        }
        System.out.println(sum);
    }
}