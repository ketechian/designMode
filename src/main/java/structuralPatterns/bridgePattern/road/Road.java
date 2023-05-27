package structuralPatterns.bridgePattern.road;

import structuralPatterns.bridgePattern.vehicle.Vehicle;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 15:57
 */
public abstract class Road {
    protected Vehicle vehicle;

    public Road(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    public abstract void driveOnRoad();
}
