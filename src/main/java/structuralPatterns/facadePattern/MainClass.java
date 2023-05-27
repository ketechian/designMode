package structuralPatterns.facadePattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/7 13:25
 */
public class MainClass {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
