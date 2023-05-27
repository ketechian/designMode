package behavioralPatterns.interpreterPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/8 15:54
 */
public class TerminalExpression implements Expression{
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
