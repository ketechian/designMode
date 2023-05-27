package creationalPatterns.PrototypePattern.shape;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 10:04
 */
public class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

}
