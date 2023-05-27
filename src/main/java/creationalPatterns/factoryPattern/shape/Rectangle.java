package creationalPatterns.factoryPattern.shape;

import creationalPatterns.factoryPattern.Shape;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/1 14:03
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
