package creationalPatterns.PrototypePattern.hashTable;

import creationalPatterns.PrototypePattern.shape.Circle;
import creationalPatterns.PrototypePattern.shape.Shape;
import creationalPatterns.PrototypePattern.shape.Square;
import creationalPatterns.PrototypePattern.shape.Rectangle;

import java.util.Hashtable;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 10:05
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
