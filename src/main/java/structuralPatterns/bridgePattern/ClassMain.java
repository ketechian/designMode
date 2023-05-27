package structuralPatterns.bridgePattern;

import structuralPatterns.bridgePattern.road.CementRoad;
import structuralPatterns.bridgePattern.road.Road;
import structuralPatterns.bridgePattern.road.UnpavedRoad;
import structuralPatterns.bridgePattern.vehicle.Bus;
import structuralPatterns.bridgePattern.vehicle.Car;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 16:06
 */
public class ClassMain {
    public static void main(String[] args) {
        Road road1 = new CementRoad(new Car());
        road1.driveOnRoad();

        Road road2 = new UnpavedRoad(new Bus());
        road2.driveOnRoad();
    }
}
