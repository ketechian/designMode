package structuralPatterns.bridgePattern.vehicle;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 15:55
 */
public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Car");
    }
}
