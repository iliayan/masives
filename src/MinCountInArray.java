import java.util.Arrays;

public class MinCountInArray {
    public static void main(String[] args) {
        int[] array = {-3, -3, -3, 4, 5, 9, 4, 7, 4, 7};

        System.out.println("Початковий масив: " + Arrays.toString(array));
        int min = findMin(array);

        // Вивести кількість мінімальних чисел
        int count = countMin(array, min);
        System.out.println("Кількість мінімальних чисел у масиві: " + count);
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }