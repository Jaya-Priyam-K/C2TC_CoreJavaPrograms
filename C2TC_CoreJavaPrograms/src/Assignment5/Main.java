package Assignment5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for ticket booking details
        System.out.println("Enter booking details in CSV format (stageEvent,customer,noOfSeats):");
        String inputLine = sc.nextLine();
        String[] details = inputLine.split(",");

        String stageEvent = details[0];
        String customer = details[1];
        int noOfSeats = Integer.parseInt(details[2]);

        TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

        // Prompt for payment mode
        System.out.println("Enter payment mode (1. Cash, 2. Wallet, 3. Credit Card):");
        int choice = sc.nextInt();
        sc.nextLine(); // consume the newline

        booking.displayBookingDetails();

        switch (choice) {
            case 1:
                System.out.println("Enter amount (in cash):");
                double amountCash = sc.nextDouble();
                booking.makePayment(amountCash);
                break;
            case 2:
                System.out.println("Enter amount:");
                double amountWallet = sc.nextDouble();
                sc.nextLine(); // consume newline
                System.out.println("Enter wallet number:");
                String walletNumber = sc.nextLine();
                booking.makePayment(amountWallet, walletNumber);
                break;
            case 3:
                System.out.println("Enter cardholder name:");
                String cardHolderName = sc.nextLine();
                System.out.println("Enter amount:");
                double amountCard = sc.nextDouble();
                sc.nextLine(); // consume newline
                System.out.println("Enter credit card type:");
                String creditCardType = sc.nextLine();
                System.out.println("Enter CCV number:");
                String ccv = sc.nextLine();
                booking.makePayment(cardHolderName, amountCard, creditCardType, ccv);
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
