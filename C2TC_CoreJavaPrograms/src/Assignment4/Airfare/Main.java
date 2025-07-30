package Assignment4.Airfare;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();
        System.out.println("Enter the hours of travel : ");
        int hours = sc.nextInt();
        System.out.println("Enter the cost per hour : ");
        double costPerHour = sc.nextDouble();

        Airfare airfare = null;

        switch (choice) {
            case 1:
                airfare = new AirIndia(hours, costPerHour);
                break;
            case 2:
                airfare = new KingFisher(hours, costPerHour);
                break;
            case 3:
                airfare = new Indigo(hours, costPerHour);
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        double totalAmount = airfare.calculateAmount();
        System.out.printf("%.2f\n", totalAmount);

        sc.close();
    }
}
