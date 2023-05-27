package creationalPatterns.BuilderPattern.item;

import creationalPatterns.BuilderPattern.pack.Packing;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 09:05
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
