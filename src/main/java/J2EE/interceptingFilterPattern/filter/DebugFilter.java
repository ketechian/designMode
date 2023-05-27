package J2EE.interceptingFilterPattern.filter;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 22:00
 */
public class DebugFilter implements Filter{

    @Override
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
