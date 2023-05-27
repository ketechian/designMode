package creationalPatterns.BuilderPattern.item.food;

import creationalPatterns.BuilderPattern.item.ClodDrink;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 09:23
 */
public class Pepsi extends ClodDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 5.5f;
    }
}
