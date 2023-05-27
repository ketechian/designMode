package structuralPatterns.facadePattern.shape;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/7 13:17
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
