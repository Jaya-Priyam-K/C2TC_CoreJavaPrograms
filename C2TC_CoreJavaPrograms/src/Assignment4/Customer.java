package Assignment4;

public class Customer {
    private Dmart choice;

    public void chooseSection(Dmart section) {
        this.choice = section;
    }

    public void viewItems() {
        if (choice != null) {
            choice.displayItems();
        } else {
            System.out.println("No section selected.");
        }
    }
}
