import java.util.Scanner;

public class RunAmountDue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AmountDue due = new AmountDue();

        System.out.println("Enter price, quantity, and discount (optional): ");
        String input = scanner.nextLine();
        String[] values = input.split(" ");
        
        if (values.length == 1) {
            double price = Double.parseDouble(values[0]);
            double totalDue = due.computeAmountDue(price);
            System.out.printf("Amount Due: %.2f%n", totalDue);
        } else if (values.length == 2) {
            double price = Double.parseDouble(values[0]);
            int quantity = Integer.parseInt(values[1]);
            double totalDue = due.computeAmountDue(price, quantity);
            System.out.printf("Amount Due: %.2f%n", totalDue);
        } else if (values.length == 3) {
            double price = Double.parseDouble(values[0]);
            int quantity = Integer.parseInt(values[1]);
            double discount = Double.parseDouble(values[2]);
            double totalDue = due.computeAmountDue(price, quantity, discount);
            System.out.printf("Amount Due: %.2f%n", totalDue);
        } else {
            System.out.println("Invalid input. Please enter 1 to 3 values.");
        }

        scanner.close();
    }
}
