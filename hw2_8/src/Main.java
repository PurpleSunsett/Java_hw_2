import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[25];
        Random rand = new Random();
        for (int i = 0; i < 25; i++) {
            arr[i] = rand.nextInt(150, 200);
        }
        int min = 201;
        int max = 149;
        for (int i = 0; i < 25; i++){
            if (arr[i] <= min){
                min = arr[i];
            }
            if (arr[i] >= max){
                max = arr[i];
            }
        }
        System.out.println(max + " " + min); //для проверки
        System.out.print(max - min);
    }
}