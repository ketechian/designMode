package behavioralPatterns.strategyPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 14:15
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
