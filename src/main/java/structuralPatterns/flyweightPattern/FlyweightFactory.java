package structuralPatterns.flyweightPattern;

import java.util.Hashtable;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/7 13:39
 */
public class FlyweightFactory {
    //定义了一个Hashtable用来存储各个对象
    private Hashtable flyweights = new Hashtable();

    public FlyweightFactory() {
    }

    public Flyweight getFlyWeight(Object obj) {
        //选出要实例化的对象
        Flyweight flyweight = (Flyweight) flyweights.get(obj);
        if (flyweight == null) {
            //产生新的ConcreteFlyweight
            flyweight = new ConcreteFlyweight((String) obj);
            flyweights.put(obj, flyweight);
        }
        return flyweight;
    }

    public int getFlyweightSize() {
        return flyweights.size();
    }

}
