package creationalPatterns.PrototypePattern.shape;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 09:58
 */
public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
