package J2EE.compositeEntityPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 20:52
 */
public class MainClass {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
