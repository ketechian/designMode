package creationalPatterns.PrototypePattern;

import creationalPatterns.PrototypePattern.hashTable.ShapeCache;
import creationalPatterns.PrototypePattern.shape.Shape;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 10:14
 */
public class MainClass {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
