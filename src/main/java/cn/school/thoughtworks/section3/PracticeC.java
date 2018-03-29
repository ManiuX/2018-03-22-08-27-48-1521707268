package cn.school.thoughtworks.section3;

import java.util.*;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String obj: collectionA){

            if(map.containsKey(obj)){
                map.put(obj, map.get(obj).intValue() + 1);
            }else{
                map.put(obj, 1);
            }
        }
        for(int i=0;i<object.get("value").size();i++) {
            int k=map.get(object.get("value").get(i));
            if (map.containsKey(object.get("value").get(i))) {
                k=k-k/3;
                map.put(object.get("value").get(i),k);
            }
        }
        return map;
    }
}
