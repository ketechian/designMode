package behavioralPatterns.statePattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 13:38
 */
public class StopState implements State {
    @Override
    public String toString(){
        return "Stop State";
    }

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }
}
