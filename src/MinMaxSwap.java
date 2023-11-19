import java.util.Arrays;
import java.util.Random;

public class MinMaxSwap {
    public static void main(String[] args) {
        int[] array = new int[10];

        // Заповнення масиву рандомними значеннями
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Встановіть максимальне значення за потребою
        }

        System.out.println("Початковий масив: " + Arrays.toString(array));

        // Знаходження індексів мінімального та максимального значень
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            } else if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        // Поміняти місцями мінімальне та максимальне значення
        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        System.out.println("Масив після обміну мінімуму та максимуму: " + Arrays.toString(array));
    }
}