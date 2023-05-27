package behavioralPatterns.mediatorPattern;

import java.util.Date;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/8 16:26
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
