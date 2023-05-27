package creationalPatterns.BuilderPattern.item.food;

import creationalPatterns.BuilderPattern.item.ClodDrink;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 09:22
 */
public class Coke extends ClodDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 6.0f;
    }
}
