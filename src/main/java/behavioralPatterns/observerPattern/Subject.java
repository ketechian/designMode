package behavioralPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 被观察者
 * @Author: HZY
 * @CreateTime: 2022/4/11 10:48
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();    //状态改变
    public void setMsg(String msg) {
        notifyAll(msg);
    }
    //订阅
    public void addAttach(Observer observer) {
        observers.add(observer);
    }
    //通知所有订阅的观察者
    private void notifyAll(String msg) {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
}
