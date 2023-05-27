package behavioralPatterns.visitorPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 14:41
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
