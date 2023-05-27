package structuralPatterns.facadePattern.shape;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/7 13:18
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
