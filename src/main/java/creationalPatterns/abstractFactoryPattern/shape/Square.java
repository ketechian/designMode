package creationalPatterns.abstractFactoryPattern.shape;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/1 14:04
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }
}
