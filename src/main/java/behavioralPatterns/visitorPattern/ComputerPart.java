package behavioralPatterns.visitorPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 14:38
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
