package creationalPatterns.BuilderPattern.item.food;

import creationalPatterns.BuilderPattern.item.Burger;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 09:19
 */
public class BeefBurger extends Burger {
    @Override
    public String name() {
        return "BeefBurger";
    }

    @Override
    public float price() {
        return 20.0f;
    }
}
