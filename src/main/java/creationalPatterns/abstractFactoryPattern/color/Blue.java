package creationalPatterns.abstractFactoryPattern.color;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/1 14:26
 */
public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method");
    }
}
