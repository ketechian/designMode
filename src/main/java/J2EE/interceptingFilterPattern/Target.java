package J2EE.interceptingFilterPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 22:01
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
