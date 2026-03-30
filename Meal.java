public class Meal extends RestaurantItem {
    private int calories;
    private String spiceLevel;

    public Meal(String itemName, double price, int calories, String spiceLevel) {
        super(itemName, price); // Constructor chaining
        this.calories = calories;
        this.spiceLevel = spiceLevel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling parent behavior
        System.out.println("Calories: " + this.calories + " kcal");
        System.out.println("Spice Level: " + this.spiceLevel);
    }

    // Task-specific action
    public void customizeSpice(String newLevel) {
        this.spiceLevel = newLevel;
        System.out.println("Spice level updated to: " + this.spiceLevel);
    }

    @Override
    public String toString() {
        return super.toString() + " -> Meal [Calories=" + calories + ", Spice=" + spiceLevel + "]";
    }
}