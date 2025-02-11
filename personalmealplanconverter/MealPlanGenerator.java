package personalmealplanconverter;

public class MealPlanGenerator {
    public static void main(String[] args) {
        // Creating specific meal instances
        VegetarianMeal vegMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();
        KetoMeal ketoMeal = new KetoMeal();
        HighProtienMeal proteinMeal = new HighProtienMeal();

        // Generating meals using the generic method
        Meal<VegetarianMeal> meal1 = MealPlanner.generateMealPlan(vegMeal);
        Meal<VeganMeal> meal2 = MealPlanner.generateMealPlan(veganMeal);
        Meal<KetoMeal> meal3 = MealPlanner.generateMealPlan(ketoMeal);
        Meal<HighProtienMeal> meal4 = MealPlanner.generateMealPlan(proteinMeal);

        // Creating a meal planner to store different meals
        MealPlanner myMealPlanner = new MealPlanner();
        myMealPlanner.addMeal(meal1);
        myMealPlanner.addMeal(meal2);
        myMealPlanner.addMeal(meal3);
        myMealPlanner.addMeal(meal4);

        // Displaying all meals in the plan
        myMealPlanner.showMealPlans();
    }
}
