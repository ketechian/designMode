package creationalPatterns.abstractFactoryPattern.shape;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/1 14:06
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
