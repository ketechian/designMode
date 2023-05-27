package behavioralPatterns.commandPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/8 15:00
 */
public class TV {
    public void open() {
        System.out.println("打开电视机");
    }
    public void change() {
        System.out.println("切换电视机台");
    }
    public void close() {
        System.out.println("关闭电视机");
    }
}
