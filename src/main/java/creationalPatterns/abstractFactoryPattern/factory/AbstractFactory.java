package creationalPatterns.abstractFactoryPattern.factory;

import creationalPatterns.abstractFactoryPattern.color.Color;
import creationalPatterns.abstractFactoryPattern.shape.Shape;

/**
 * @Description 为 Color 和 Shape 对象创建抽象类来获取工厂
 * @Author: HZY
 * @CreateTime: 2022/4/1 14:29
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);

}
