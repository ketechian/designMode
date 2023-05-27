package behavioralPatterns.chainofResponsibilityPattern;

import behavioralPatterns.chainofResponsibilityPattern.leaveHandler.AbstractLeaveHandler;
import behavioralPatterns.chainofResponsibilityPattern.leaveHandler.DeptManagerLeaveHandler;
import behavioralPatterns.chainofResponsibilityPattern.leaveHandler.DirectLeaderLeaveHandler;
import behavioralPatterns.chainofResponsibilityPattern.leaveHandler.GManagerLeaveHandler;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/7 17:34
 */
public class ResponsibilityTest {
    public static void main(String[] args) {
        LeaveRequest request = LeaveRequest
                .builder()
                .leaveDays(1)
                .name("小明")
                .build();


        AbstractLeaveHandler directLeaderLeaveHandler = new DirectLeaderLeaveHandler("县令");
        DeptManagerLeaveHandler deptManagerLeaveHandler = new DeptManagerLeaveHandler("知府");
        GManagerLeaveHandler gManagerLeaveHandler = new GManagerLeaveHandler("京兆尹");

        directLeaderLeaveHandler.setNextHandler(deptManagerLeaveHandler);
        deptManagerLeaveHandler.setNextHandler(gManagerLeaveHandler);

        directLeaderLeaveHandler.handlerRequest(request);
    }
}
