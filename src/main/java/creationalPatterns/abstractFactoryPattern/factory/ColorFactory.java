package creationalPatterns.abstractFactoryPattern.factory;

import creationalPatterns.abstractFactoryPattern.color.Blue;
import creationalPatterns.abstractFactoryPattern.color.Color;
import creationalPatterns.abstractFactoryPattern.color.Green;
import creationalPatterns.abstractFactoryPattern.color.Red;
import creationalPatterns.abstractFactoryPattern.shape.Shape;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/1 14:35
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if("RED".equalsIgnoreCase(color)){
            return new Red();
        } else if("GREEN".equalsIgnoreCase(color)){
            return new Green();
        } else if("BLUE".equalsIgnoreCase(color)){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
