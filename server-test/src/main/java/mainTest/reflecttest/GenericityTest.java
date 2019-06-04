package mainTest.reflecttest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/3/19.
 */
public class GenericityTest {


    public void testGenericity(Collection<?> sourceCollection,Collection<?> targetCollection) {
        Map<Object, Object> sourceMap = new HashMap<>();
        Map<Object, Object> targetMap = new HashMap<>();
        for (Object obj : sourceCollection) {
            sourceMap = Test.reflect(obj);
        }
        for (Object obj : targetCollection) {
            targetMap = Test.reflect(obj);
        }
        // TODO: 2019/3/19 比较两个map是否发生变化


    }




}
