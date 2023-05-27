package creationalPatterns.BuilderPattern.item;

import creationalPatterns.BuilderPattern.pack.Packing;
import creationalPatterns.BuilderPattern.pack.Wrapper;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 09:11
 */
public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
