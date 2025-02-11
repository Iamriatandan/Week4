package personalmealplanconverter;

public class Meal<T extends MealPlan> {
    private T mealType; // Stores the specific meal type

    public Meal(T mealType) {
        this.mealType = mealType;
    }

    public void displayMealDetails() {
        mealType.showMeal(); // Calls the specific meal's display method
    }
}
