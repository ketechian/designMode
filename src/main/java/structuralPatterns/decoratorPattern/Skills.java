package structuralPatterns.decoratorPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/7 00:00
 */
//抽象装饰器(Decorator): 维护对组件对象和其子类组件的引用,此处为技能栏
public class Skills implements Hero{
    protected  Hero hero;

    public Skills(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void learnSkills() {
        if (hero != null) {
            hero.learnSkills();
        }
    }
}
