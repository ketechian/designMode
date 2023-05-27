package structuralPatterns.decoratorPattern.ConreteDecoratorSkills;

import structuralPatterns.decoratorPattern.Hero;
import structuralPatterns.decoratorPattern.Skills;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/7 00:04
 */
//具体装饰器角色(ConcreteDecorator)：向组件添加新的职责
public class Skill_Q extends Skills {
    private String skillName;

    public Skill_Q(Hero hero,String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("学习了技能Q:" +skillName);
        super.learnSkills();
    }
}
