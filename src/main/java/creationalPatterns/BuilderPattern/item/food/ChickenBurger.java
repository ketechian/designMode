package creationalPatterns.BuilderPattern.item.food;

import creationalPatterns.BuilderPattern.item.Burger;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 09:20
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 20.0f;
    }
}
