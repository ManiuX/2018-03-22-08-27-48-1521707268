package cn.school.thoughtworks.section2;
import java.util.*;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Set<String> collection1Set = new HashSet<>(collection1);
        Map<String, Integer> map = new HashMap<>();
        for (String item :collection1Set) {
            Integer count = Collections.frequency(collection1, item);
            if(item.contains("-")){
                String[] splitStr = item.split("-");
                item = splitStr[0];
                count = Integer.valueOf(splitStr[1]);
            }
           map.put(item, count);
        }
        return map;
    }
}
