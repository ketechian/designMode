package creationalPatterns.BuilderPattern.buider;

import creationalPatterns.BuilderPattern.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 09:26
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void  addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
