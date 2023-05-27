package behavioralPatterns.commandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/8 15:05
 */
public class Control {
    public List<Order> orders = new ArrayList<>();

    public Control(Order order) {
        orders.add(order);
    }

    public Control(List<Order> orders) {
        this.orders.addAll(orders);
    }

    public void action() {
        orders.forEach(e -> e.execute());
    }
}
