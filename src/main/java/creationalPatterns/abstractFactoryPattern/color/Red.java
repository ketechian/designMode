package creationalPatterns.abstractFactoryPattern.color;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/1 14:25
 */
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method");
    }
}
