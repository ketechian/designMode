package behavioralPatterns.commandPattern;

import behavioralPatterns.commandPattern.command.ChangeCommand;
import behavioralPatterns.commandPattern.command.CloseCommand;
import behavioralPatterns.commandPattern.command.OpenCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/8 15:08
 */
public class MainClass {
    public static void main(String[] args) {
        Order openOrder = new OpenCommand();
        Order closeOrder = new CloseCommand();
        Order changeOrder = new ChangeCommand();

        List<Order> list = new ArrayList<>();
        list.add(openOrder);
        list.add(changeOrder);
        list.add(closeOrder);

        Control control = new Control(list);
        control.action();
    }
}
