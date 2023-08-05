import java.util.Arrays;
import java.util.Scanner;

public class _2104373_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of space-separated integers: ");
        String input = scanner.nextLine();
        scanner.close();

        int[] numbers = parseIntArray(input);
        Arrays.sort(numbers);

        System.out.print("Output: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }

    private static int[] parseIntArray(String input) {
        String[] strNumbers = input.split("\\s*,\\s*");
        int[] numbers = new int[strNumbers.length];

        for (int i = 0; i < strNumbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }

        return numbers;
    }
}
