package personalmealplanconverter;

public class VegetarianMeal implements MealPlan{
    @Override
    public void showMeal() {
        System.out.println("Vegetarian Meal: Includes vegetables, fruits, dairy, and whole grains.");
    }
}
