package creationalPatterns.abstractFactoryPattern.factory;

/**
 * @Description 工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂
 * @Author: HZY
 * @CreateTime: 2022/4/1 14:36
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if("SHAPE".equalsIgnoreCase(choice)){
            return new ShapeFactory();
        } else if("COLOR".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        return null;
    }
}
