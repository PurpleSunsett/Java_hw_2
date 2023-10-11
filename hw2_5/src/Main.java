import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[50];
        Random rand = new Random();
        for (int i = 0; i < 50; i++) {
            arr[i] = rand.nextInt(10000, 10000000);
        }
        int max = 9999;
        for (int i = 0; i < 50; i++){
            if (arr[i] >= max){
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}