public class Dessert extends Meal {
    private String sweetnessLevel;
    private boolean isColdServed;

    public Dessert(String itemName, double price, int calories, String spiceLevel, String sweetness, boolean isCold) {
        super(itemName, price, calories, spiceLevel); // Constructor chaining
        this.sweetnessLevel = sweetness;
        this.isColdServed = isCold;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling parent behavior
        System.out.println("Sweetness: " + this.sweetnessLevel);
        System.out.println("Served Cold: " + (this.isColdServed ? "Yes" : "No"));
    }

    // Overriding the calculation method
    @Override
    public double calculateTotal() {
        // Desserts have a flat $2.00 "sugar tax" added after percentage tax
        return super.calculateTotal() + 2.00;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Dessert [Sweetness=" + sweetnessLevel + "]";
    }
}