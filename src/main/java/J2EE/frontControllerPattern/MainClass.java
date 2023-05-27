package J2EE.frontControllerPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 21:04
 */
public class MainClass {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
