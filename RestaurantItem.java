public class RestaurantItem {
    private String itemName;
    private double price;

    public RestaurantItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public void prepare() {
        System.out.println("Preparing: " + this.itemName);
    }

    public void serve() {
        System.out.println("Serving: " + this.itemName);
    }

    public void displayInfo() {
        System.out.println("Item: " + this.itemName);
        System.out.println("Price: $" + this.price);
    }

    // Task-specific calculation: Price with 10% tax
    public double calculateTotal() {
        return this.price * 1.10;
    }

    @Override
    public String toString() {
        return "RestaurantItem [Name=" + itemName + ", Price=" + price + "]";
    }
}