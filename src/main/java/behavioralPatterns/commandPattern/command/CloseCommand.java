package behavioralPatterns.commandPattern.command;

import behavioralPatterns.commandPattern.Order;
import behavioralPatterns.commandPattern.TV;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/8 15:03
 */
public class CloseCommand implements Order {
    private TV tv = new TV();
    @Override
    public void execute() {
        tv.close();
    }
}
