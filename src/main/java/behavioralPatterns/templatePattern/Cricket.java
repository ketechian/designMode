package behavioralPatterns.templatePattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 14:26
 */
public class Cricket extends Game{
    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
