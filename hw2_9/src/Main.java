import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[30];
        Random rand = new Random();
        for (int i = 0; i < 30; i++) {
            arr[i] = rand.nextInt(1920, 2023);
        }
        int max = 1919;
        int min = 2024;
        for (int i = 0; i < 30; i++){
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