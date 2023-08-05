import java.util.Scanner;

public class _2104373_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the substring to search for: ");
        String substringToSearch = scanner.nextLine();
        scanner.close();

        // Print the length of the string
        int length = input.length();
        System.out.println("Length of the string: " + length);

        // Convert the string to uppercase
        String uppercaseString = input.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseString);

        // Check if the string contains the specific substring (case-insensitive)
        if (input.toLowerCase().contains(substringToSearch.toLowerCase())) {
            System.out.println("Substring Found");
        } else {
            System.out.println("Substring Not Found");
        }
    }
}
