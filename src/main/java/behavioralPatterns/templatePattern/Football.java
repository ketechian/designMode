package behavioralPatterns.templatePattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 14:26
 */
public class Football extends Game{
    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
