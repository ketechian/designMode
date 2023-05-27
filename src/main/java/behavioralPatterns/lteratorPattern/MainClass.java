package behavioralPatterns.lteratorPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/8 16:14
 */
public class MainClass {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
