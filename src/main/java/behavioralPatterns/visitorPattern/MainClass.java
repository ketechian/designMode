package behavioralPatterns.visitorPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 19:36
 */
public class MainClass {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
     }
}
