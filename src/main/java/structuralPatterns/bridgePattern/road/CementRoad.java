package structuralPatterns.bridgePattern.road;

import structuralPatterns.bridgePattern.vehicle.Vehicle;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 16:04
 */
public class CementRoad extends Road{
    public CementRoad(Vehicle vehicle)
    {
        super(vehicle);
    }

    @Override
    public void driveOnRoad()
    {
        super.vehicle.drive();
        System.out.println("行驶在水泥路");
    }
}
