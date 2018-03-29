package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Set<String> collection1Set = new HashSet<>(collectionA);
        Map<String, Integer> map = new HashMap<>();
        for (String item :collection1Set) {
            Integer count = Collections.frequency(collectionA, item);
            if(item.contains("-")){
                String[] splitStr = item.split("-");
                item = splitStr[0];
                count = Integer.valueOf(splitStr[1]);
            }
            map.put(item, count);
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
