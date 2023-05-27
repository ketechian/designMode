package creationalPatterns.factoryPattern.shape;

import creationalPatterns.factoryPattern.Shape;

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
