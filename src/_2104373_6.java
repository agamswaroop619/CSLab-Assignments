import java.util.Scanner;

public class _2104373_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature (e.g., C 37 or F 98.6): ");
        String input = scanner.nextLine();
        scanner.close();

        char scale = input.charAt(0);
        double temperature = Double.parseDouble(input.substring(2));

        if (scale == 'C' || scale == 'c') {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println("Fahrenheit: " + fahrenheit);
        } else if (scale == 'F' || scale == 'f') {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println("Celsius: " + celsius);
        } else {
            System.out.println("Invalid input. Please specify the temperature scale (C or F).");
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
