package creationalPatterns.BuilderPattern.buider;

import creationalPatterns.BuilderPattern.item.food.BeefBurger;
import creationalPatterns.BuilderPattern.item.food.ChickenBurger;
import creationalPatterns.BuilderPattern.item.food.Coke;
import creationalPatterns.BuilderPattern.item.food.Pepsi;

/**
 * @Description 设立套餐
 * @Author: HZY
 * @CreateTime: 2022/4/6 09:34
 */
public class SetMealBuilder {

    public Meal setMeal1() {
        Meal meal = new Meal();
        meal.addItem(new BeefBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal setMeal2() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
