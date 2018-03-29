package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        for(int i=0;i<object.get("value").size();i++) {
            int k=collectionA.get(object.get("value").get(i));
            if (collectionA.containsKey(object.get("value").get(i))) {
                k=k-k/3;
                collectionA.put(object.get("value").get(i),k);
            }
        }
        return collectionA;

    }
}
