
    import java.util.Scanner;

    public class _2104373_2  {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a date in the format yyyy-MM-dd: ");
            String inputDate = scanner.nextLine();
            scanner.close();

            String convertedDate = convertDateFormat(inputDate);
            System.out.println("Converted date: " + convertedDate);
        }

        public static String convertDateFormat(String inputDate) {
            String[] parts = inputDate.split("-");
            if (parts.length != 3) {
                System.out.println("Invalid date format. Please enter the date in the format yyyy-MM-dd.");
                return "";
            }

            String year = parts[0];
            String month = parts[1];
            String day = parts[2];

            return day + "/" + month + "/" + year;
        }
    }
