package structuralPatterns.bridgePattern.road;

import structuralPatterns.bridgePattern.vehicle.Vehicle;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 16:01
 */
public class UnpavedRoad extends Road{
    public UnpavedRoad(Vehicle vehicle)
    {
        super(vehicle);
    }

    @Override
    public void driveOnRoad()
    {
        super.vehicle.drive();
        System.out.println("行驶在石子路");
    }
}

