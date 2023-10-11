import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            arr[i] = rand.nextInt(1, 1000);
        }
        int max = 0;
        for (int i = 0; i < 100; i++){
            if (arr[i] >= max){
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}