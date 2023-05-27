package structuralPatterns.decoratorPattern;

import structuralPatterns.decoratorPattern.ConreteDecoratorSkills.Skill_E;
import structuralPatterns.decoratorPattern.ConreteDecoratorSkills.Skill_Q;
import structuralPatterns.decoratorPattern.ConreteDecoratorSkills.Skill_R;
import structuralPatterns.decoratorPattern.ConreteDecoratorSkills.Skill_W;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/7 00:08
 */
public class Player {
    public static void main(String[] args) {
        //选择英雄
        Hero hero = new ConcreteHero("李青");

        Skills skills = new Skills(hero);
        Skills r = new Skill_R(skills, "猛龙摆尾");
        Skills e = new Skill_E(skills, "天雷破/摧筋断骨");
        Skills w = new Skill_W(skills, "金钟罩/铁布衫");
        Skills q = new Skill_Q(skills, "天音波/回音击");
        //学习技能
        q.learnSkills();
        w.learnSkills();
        e.learnSkills();
        r.learnSkills();
    }
}
