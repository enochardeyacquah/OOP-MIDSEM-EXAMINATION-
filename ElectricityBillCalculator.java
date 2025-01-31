import java.util.Scanner;

public class ElectricityBillCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input consumer details
        System.out.print("Enter Consumer Number: ");
        String consumerNo = scanner.nextLine();

        System.out.print("Enter Consumer Name: ");
        String consumerName = scanner.nextLine();

        System.out.print("Enter Previous Month Reading: ");
        int previousReading = scanner.nextInt();

        System.out.print("Enter Current Month Reading: ");
        int currentReading = scanner.nextInt();

        System.out.print("Enter EB Connection Type (domestic/commercial): ");
        scanner.nextLine(); // Consume newline
        String ebType = scanner.nextLine();

        // Validate readings
        if (currentReading < previousReading) {
            System.out.println("Error: Current reading must be greater than or equal to the previous reading.");
        } else {
            // Calculate units consumed
            int unitsConsumed = currentReading - previousReading;

            // Calculate the bill
            double billAmount = calculateBill(unitsConsumed, ebType);

            // Display bill details
            System.out.println("\n--- Electricity Bill Details ---");
            System.out.println("Consumer No.: " + consumerNo);
            System.out.println("Consumer Name: " + consumerName);
            System.out.println("Units Consumed: " + unitsConsumed);
            System.out.println("EB Type: " + ebType);
            System.out.printf("Bill Amount: Gh. %.2f%n", billAmount);
        }

        scanner.close();
    }

    private static double calculateBill(int units, String type) {
        double amount = 0;

        if (type.equalsIgnoreCase("domestic")) {
            if (units <= 100) amount = units * 1;
            else if (units <= 200) amount = 100 * 1 + (units - 100) * 2.50;
            else if (units <= 500) amount = 100 * 1 + 100 * 2.50 + (units - 200) * 4;
            else amount = 100 * 1 + 100 * 2.50 + 300 * 4 + (units - 500) * 6;
        } else if (type.equalsIgnoreCase("commercial")) {
            if (units <= 100) amount = units * 2;
            else if (units <= 200) amount = 100 * 2 + (units - 100) * 4.50;
            else if (units <= 500) amount = 100 * 2 + 100 * 4.50 + (units - 200) * 6;
            else amount = 100 * 2 + 100 * 4.50 + 300 * 6 + (units - 500) * 7;
        } else {
            throw new IllegalArgumentException("Invalid EB connection type. Choose 'domestic' or 'commercial'.");
        }

        return amount;
    }
}
