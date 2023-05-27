package behavioralPatterns.mediatorPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/8 16:28
 */
public class MainClass {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
