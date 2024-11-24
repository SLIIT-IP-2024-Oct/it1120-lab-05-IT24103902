import java.util.Scanner;

public class IT24103902Lab5Q3{
    public static final double ROOM_CHARGE = 48000.0;
    public static final int MIN_DAYS_FOR_DISCOUNT = 3;
    public static final int MIN_DAYS_FOR_HIGHER_DISCOUNT = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //date input
        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        // Validate date
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        } else if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        // Calculate number of days
        int numDays = endDate - startDate;

        // Calculate discount
        double discountRate = 0;
        if (numDays >= MIN_DAYS_FOR_HIGHER_DISCOUNT) {
            discountRate = 0.2;
        } else if (numDays >= MIN_DAYS_FOR_DISCOUNT) {
            discountRate = 0.1;
        }

        // Calculate total amount
        double totalAmount = ROOM_CHARGE * numDays * (1 - discountRate);

        // Print output
        System.out.println(); //blank line
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE + "/=");
        System.out.println("Number of Days Reserved: " + numDays);
        System.out.println("Total Amount to be Paid: " + totalAmount);

        scanner.close();
    }
}