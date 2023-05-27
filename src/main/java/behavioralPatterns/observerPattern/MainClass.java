package behavioralPatterns.observerPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 10:50
 */
public class MainClass {
    public static void main(String[] args) {
        F_Observer fObserver = new F_Observer();
        S_Observer sObserver = new S_Observer();
        Subject subject = new Subject();
        subject.addAttach(fObserver);
        subject.addAttach(sObserver);
        subject.setMsg("msg change");
    }
}
