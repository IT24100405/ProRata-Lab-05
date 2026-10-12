import java.util.Scanner;

public class IT24100405Lab5Q3 {
    public static void main(String[] args) {
        final double ROOM_CHARGE_PER_DAY = 48000.0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();
        
        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();
        
        // Validation 1: Dates must be between 1 and 31
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("\nError: Days must be between 1 and 31");
            input.close();
            return;
        }
        
        // Validation 2: Start Date must be less than End Date
        if (startDate >= endDate) {
            System.out.println("\nError: Start Date must be less than End Date");
            input.close();
            return;
        }
        
        int daysReserved = endDate - startDate;
        double totalCost = daysReserved * ROOM_CHARGE_PER_DAY;
        double discountRate = 0.0;
        
        if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = 0.10;
        } else if (daysReserved >= 5) {
            discountRate = 0.20;
        }
        
        double finalAmount = totalCost - (totalCost * discountRate);
        
        System.out.println("\nRoom Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + finalAmount);
        
        input.close();
    }
}