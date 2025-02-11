package personalmealplanconverter;
import java.util.*;
public class MealPlanner {
    private List<Meal<? extends MealPlan>> mealList; // List to store different meals

    public MealPlanner() {
        mealList = new ArrayList<>();
    }

    // Add a meal to the meal planner
    public void addMeal(Meal<? extends MealPlan> meal) {
        mealList.add(meal);
    }

    // Display all meals in the plan
    public void showMealPlans() {
        System.out.println("\n--- Personalized Meal Plan ---");
        for (Meal<? extends MealPlan> meal : mealList) {
            meal.displayMealDetails();
        }
    }

    // Step 5: Generic method to generate a meal plan
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealType) {
        System.out.println("\nGenerating a personalized meal plan...");
        return new Meal<>(mealType);
    }
}
