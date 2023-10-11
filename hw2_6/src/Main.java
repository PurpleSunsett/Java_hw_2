import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            arr[i] = rand.nextInt(100, 500);
        }
        int min = 501;
        for (int i = 0; i < 20; i++){
            if (arr[i] <= min){
                min = arr[i];
            }
        }
        System.out.print(min);
    }
}