package structuralPatterns.facadePattern;

import structuralPatterns.facadePattern.shape.Shape;
import structuralPatterns.facadePattern.shape.Circle;
import structuralPatterns.facadePattern.shape.Rectangle;
import structuralPatterns.facadePattern.shape.Square;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/7 13:21
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }

}
