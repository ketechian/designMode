package creationalPatterns.abstractFactoryPattern.factory;

import creationalPatterns.abstractFactoryPattern.color.Color;
import creationalPatterns.abstractFactoryPattern.shape.Circle;
import creationalPatterns.abstractFactoryPattern.shape.Rectangle;
import creationalPatterns.abstractFactoryPattern.shape.Shape;
import creationalPatterns.abstractFactoryPattern.shape.Square;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/1 14:06
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    //使用 getShape 方法获取形状类型的对象
    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if("CIRCLE".equalsIgnoreCase(shapeType)){
            return new Circle();
        } else if("RECTANGLE".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        } else if("SQUARE".equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }
}
