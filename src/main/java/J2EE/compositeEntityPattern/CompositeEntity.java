package J2EE.compositeEntityPattern;

import J2EE.compositeEntityPattern.dependentObject.CoarseGrainedObject;

/**
 * @Description 创建组合实体
 * @Author: HZY
 * @CreateTime: 2022/4/11 20:49
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
