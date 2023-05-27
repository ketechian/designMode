package behavioralPatterns.mementoPattern;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description 备忘录角色
 * @Author: HZY
 * @CreateTime: 2022/4/11 09:28
 */

@Data
@AllArgsConstructor
public class ChessmanMemento {
    private String label;
    private int x;
    private int y;
}
