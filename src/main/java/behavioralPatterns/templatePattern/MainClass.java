package behavioralPatterns.templatePattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 14:28
 */
public class MainClass {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
