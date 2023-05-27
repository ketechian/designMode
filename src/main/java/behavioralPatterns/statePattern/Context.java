package behavioralPatterns.statePattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 13:49
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
