package creationalPatterns.BuilderPattern.item;

import creationalPatterns.BuilderPattern.pack.Bottle;
import creationalPatterns.BuilderPattern.pack.Packing;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 09:16
 */
public abstract class ClodDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
