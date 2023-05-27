package structuralPatterns.decoratorPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 23:58
 */
//具体组件角色(ConcreteComponent)：定义一个要被装饰器装饰的对象，即 Component 的具体实现
public class ConcreteHero implements Hero{
    private String name;

    public ConcreteHero(String name) {
        this.name = name;
    }
    @Override
    public void learnSkills() {
        System.out.println(name + "学习了以上技能！");
    }
}
