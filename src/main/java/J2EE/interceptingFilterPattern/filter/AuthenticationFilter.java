package J2EE.interceptingFilterPattern.filter;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 22:00
 */
public class AuthenticationFilter implements Filter{
    @Override
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}
