package creationalPatterns.PrototypePattern.shape;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 10:03
 */
public class Square extends Shape{
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
