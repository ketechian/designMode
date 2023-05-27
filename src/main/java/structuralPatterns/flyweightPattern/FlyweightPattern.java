package structuralPatterns.flyweightPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/7 13:47
 */
public class FlyweightPattern {
    FlyweightFactory factory = new FlyweightFactory();
    Flyweight fly1;
    Flyweight fly2;
    Flyweight fly3;
    Flyweight fly4;
    Flyweight fly5;
    Flyweight fly6;

    /**
     * Creates a new instance of FlyweightPattern
     */


    public FlyweightPattern() {
        fly1 = factory.getFlyWeight("Google");
        fly2 = factory.getFlyWeight("Microsoft");
        fly3 = factory.getFlyWeight("Google");
        fly4 = factory.getFlyWeight("Google");
        fly5 = factory.getFlyWeight("Google");
        fly6 = factory.getFlyWeight("baidu");
    }


    public void showFlyweight() {
        fly1.operation();
        fly2.operation();
        fly3.operation();
        fly4.operation();
        fly5.operation();
        fly6.operation();
        int objSize = factory.getFlyweightSize();
        System.out.println("objSize = " + objSize);
    }
}
