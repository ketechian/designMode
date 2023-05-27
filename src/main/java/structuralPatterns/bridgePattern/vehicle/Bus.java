package structuralPatterns.bridgePattern.vehicle;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 15:56
 */
public class Bus implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Bus");
    }
}
