package behavioralPatterns.commandPattern.command;

import behavioralPatterns.commandPattern.Order;
import behavioralPatterns.commandPattern.TV;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/8 15:04
 */
public class ChangeCommand implements Order {
    private TV tv = new TV();

    @Override
    public void execute() {
        tv.change();
    }
}
