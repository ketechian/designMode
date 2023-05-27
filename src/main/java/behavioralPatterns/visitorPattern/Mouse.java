package behavioralPatterns.visitorPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 14:40
 */
public class Mouse implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
