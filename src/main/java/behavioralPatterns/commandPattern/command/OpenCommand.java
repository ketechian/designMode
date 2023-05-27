package behavioralPatterns.commandPattern.command;

import behavioralPatterns.commandPattern.Order;
import behavioralPatterns.commandPattern.TV;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/8 14:55
 */
public class OpenCommand implements Order {
    private TV tv = new TV();
    @Override
    public void execute() {
        tv.open();
    }
}
