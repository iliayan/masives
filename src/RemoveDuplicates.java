import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 7, 1, 8, 9, 3, 10, 11, 5};

        System.out.println("Початковий масив: " + Arrays.toString(array));

        // Видалення дублікатів
        int[] uniqueArray = removeDuplicates(array);

        System.out.println("Масив без дублікатів: " + Arrays.toString(uniqueArray));
    }

    private static int[] removeDuplicates(int[] array) {
        // Використовуємо HashSet для видалення дублікатів
        HashSet<Integer> set = new HashSet<>();
        for (int value : array) {
            set.add(value);
        }

        // Перетворення HashSet назад у масив
        int[] result = new int[set.size()];
        int index = 0;
        for (int value : set) {
            result[index++] = value;
        }

        return result;
    }
}