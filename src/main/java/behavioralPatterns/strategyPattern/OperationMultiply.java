package behavioralPatterns.strategyPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 14:14
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
