package structuralPatterns.flyweightPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/7 13:36
 */
public class ConcreteFlyweight extends Flyweight {
    private String string;

    public ConcreteFlyweight(String str) {
        string = str;
    }

    @Override
    public void operation() {
        System.out.println("借出的书名 : " + string);
    }
}
