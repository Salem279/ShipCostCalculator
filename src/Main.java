import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double shippingCost = 0;
        double totalCost = 0;

        System.out.print("Enter the price of the item: ");

        // Check if the input is a valid number
        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine(); // Clear the buffer

            // Process shipping cost logic
            if (itemPrice >= 100) {
                shippingCost = 0; // Free shipping for $100+
            } else {
                shippingCost = itemPrice * 0.02; // 2% shipping
            }

            totalCost = itemPrice + shippingCost;

            // Display results
            System.out.println("Shipping Cost: $" + shippingCost);
            System.out.println("Total Price: $" + totalCost);
        } else {
            // Error handling for non-numeric input
            System.out.println("Invalid input. Please enter a numeric value.");
        }
    }
}