package behavioralPatterns.chainofResponsibilityPattern.leaveHandler;

import behavioralPatterns.chainofResponsibilityPattern.LeaveRequest;

/**
 * @Description 直接主管处理类
 * @Author: HZY
 * @CreateTime: 2022/4/7 17:30
 */
public class DirectLeaderLeaveHandler extends AbstractLeaveHandler{
    public DirectLeaderLeaveHandler(String name) {
        this.handlerName = name;
    }

    @Override
    public void handlerRequest(LeaveRequest request) {
        if(request.getLeaveDays() <= this.MIN){
            System.out.println("直接主管:" + handlerName + ",已经处理;流程结束。");
            return;
        }

        if(null != this.nextHandler){
            this.nextHandler.handlerRequest(request);
        }else{
            System.out.println("审批拒绝！");
        }
    }
}
