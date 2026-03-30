public class Demo {
    public static void main(String[] args) {
        // 1. Base Class Object
        System.out.println("=== RESTAURANT ITEM ===");
        RestaurantItem item = new RestaurantItem("Generic Water", 1.50);
        item.prepare();
        item.displayInfo();
        System.out.println("Total (incl. tax): $" + item.calculateTotal());

        // 2. Intermediate Class Object
        System.out.println("\n=== MEAL OBJECT ===");
        Meal dinner = new Meal("Spicy Zinger", 8.50, 650, "High");
        dinner.serve(); // Inherited
        dinner.customizeSpice("Medium"); // Specific action
        dinner.displayInfo(); // Overridden
        System.out.println(dinner.toString());

        // 3. Derived Class Object
        System.out.println("\n=== DESSERT OBJECT ===");
        Dessert treat = new Dessert("Chocolate Lava Cake", 12.00, 450, "None", "Extra Sweet", false);
        treat.prepare(); // Inherited from RestaurantItem
        treat.displayInfo(); // Heavily Overridden
        System.out.println("Total (incl. tax + sugar tax): $" + treat.calculateTotal());
        System.out.println(treat.toString());
    }
}