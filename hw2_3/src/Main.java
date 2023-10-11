import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(0, 1000);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        int max = arr[0];
        int min = arr[0];
        int ind_min = 0;
        int ind_max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                ind_max = i;
            }
            if (arr[i] <= min) {
                min = arr[i];
                ind_min = i;
            }
        }
        int razn = max - min;
        System.out.print("Максимальный элемент = " + max + "\n" + "Минимальный элемент = " + min + "\n" + "Разность = " + razn + "\n" + "Индекс максимального элемента = " + ind_max + "\n" + "Индекс минимального элемента = " + ind_min);
    }
}