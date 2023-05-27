package creationalPatterns.BuilderPattern.buider;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 09:38
 */
public class MainClass {
    public static void main(String[] args) {
        SetMealBuilder setMealBuilder = new SetMealBuilder();

        Meal setMeal1 = setMealBuilder.setMeal1();
        System.out.println("套餐1");
        setMeal1.showItems();
        System.out.println("Total Cost: " + setMeal1.getCost());

        Meal setMeal2 = setMealBuilder.setMeal2();
        System.out.println("\n\n套餐2");
        setMeal2.showItems();
        System.out.println("Total Cost: " + setMeal2.getCost());
    }
}
