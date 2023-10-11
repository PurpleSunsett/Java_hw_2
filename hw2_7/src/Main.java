import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[25];
        Random rand = new Random();
        for (int i = 0; i < 25; i++) {
            arr[i] = rand.nextInt(10, 50);
        }
        int min = 51;
        for (int i = 0; i < 25; i++){
            if (arr[i] <= min){
                min = arr[i];
            }
        }
        System.out.print(min);
    }
}