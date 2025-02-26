import java.util.Scanner;

class CurrencyConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Display a welcome message
        System.out.println("Welcome to the Currency Converter!");
        // Main program loop
        while (true) {
            // Display the menu
            System.out.println("\nMenu:");
            System.out.println("1. Convert USD to EUR");
            System.out.println("2. Convert EUR to USD");
            System.out.println("3. Quit");
            System.out.print("Enter your choice: ");
            // Read the user's choice
            int choice = scanner.nextInt();
            // Perform the chosen operation
            switch (choice) {
                case 1:
                    convertUSDToEUR();
                    break;
                case 2:
                    convertEURToUSD();
                    break;
                case 3:
                    System.out.println("Thank you for using the Currency Converter!");
                    // Close the scanner
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Conversion rates (hardcoded for simplicity)
    private static double usdToEurRate = 0.85;
    private static double eurToUsdRate = 1.18;

    // Method to convert USD to EUR
    private static void convertUSDToEUR() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in USD: ");
        double usdAmount = scanner.nextDouble();
        double eurAmount = usdAmount * usdToEurRate;
        System.out.println(usdAmount + " USD is equivalent to " + eurAmount + " EUR");
    }

    // Method to convert EUR to USD
    private static void convertEURToUSD() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in EUR: ");
        double eurAmount = scanner.nextDouble();
        double usdAmount = eurAmount * eurToUsdRate;
        System.out.println(eurAmount + " EUR is equivalent to " + usdAmount + " USD");
    }
}