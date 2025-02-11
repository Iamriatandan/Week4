package personalmealplanconverter;

public class VeganMeal implements MealPlan{
    @Override
    public void showMeal() {
        System.out.println("Vegan Meal: Includes plant-based foods with no animal products.");
    }
}
