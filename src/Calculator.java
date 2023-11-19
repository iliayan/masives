import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    private static ArrayList<Double> numbers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введіть число або q для виведення масиву:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                printArray();
                break;
            }

            try {
                double number = Double.parseDouble(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Некоректний ввід. Будь ласка, введіть число або q.");
            }
        }
    }

    private static void printArray() {
        System.out.println("Масив чисел:");
        for (Double number : numbers) {
            System.out.println(number);
        }
    }
}
