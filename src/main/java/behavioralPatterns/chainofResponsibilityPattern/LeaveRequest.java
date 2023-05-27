package behavioralPatterns.chainofResponsibilityPattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/7 17:26
 */
@Data
@AllArgsConstructor
@Builder
public class LeaveRequest {
    /**
     * 天数
     */
    private int leaveDays;

    /**
     * 姓名
     */
    private String name;
}
