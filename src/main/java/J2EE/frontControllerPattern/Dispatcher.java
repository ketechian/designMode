package J2EE.frontControllerPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 20:59
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if("STUDENT".equalsIgnoreCase(request)){
            studentView.show();
        }else{
            homeView.show();
        }
    }
}
