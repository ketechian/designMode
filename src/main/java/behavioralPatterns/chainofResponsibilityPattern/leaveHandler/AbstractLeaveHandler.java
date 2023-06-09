package behavioralPatterns.chainofResponsibilityPattern.leaveHandler;

import behavioralPatterns.chainofResponsibilityPattern.LeaveRequest;

/**
 * @Description 请假责任链抽象处理类
 * @Author: HZY
 * @CreateTime: 2022/4/7 17:27
 */
public class AbstractLeaveHandler {
    /**
     * 直接主管审批处理的请假天数
     */
    protected int MIN = 1;
    /**
     * 部门经理处理的请假天数
     */
    protected int MIDDLE = 3;
    /**
     * 总经理处理的请假天数
     */
    protected int MAX = 30;

    /**
     * 领导名称
     */
    protected String handlerName;

    /**
     * 下一个处理节点（即更高级别的领导）
     */
    protected AbstractLeaveHandler nextHandler;

    /**
     * 设置下一节点
     */
    public void setNextHandler(AbstractLeaveHandler handler){
        this.nextHandler = handler;
    }

    /**
     * 处理请假的请求，子类实现
     */
    public void handlerRequest(LeaveRequest request){

    }
}
