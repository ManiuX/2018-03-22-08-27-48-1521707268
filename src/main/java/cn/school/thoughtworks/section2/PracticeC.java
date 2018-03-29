package cn.school.thoughtworks.section2;

import java.util.*;


public class PracticeC {
    //    List<String> collection1 = Arrays.asList(
//            "a", "a", "a",
//            "e", "e", "e", "e", "e", "e", "e",
//            "h", "h", "h", "h", "h", "h", "h[3]", "h", "h",
//            "t", "t-2", "t", "t", "t", "t", "t", "t", "t[10]",
//            "f", "f", "f", "f", "f", "f", "f", "f", "f",
//            "c:8",
//            "g", "g", "g", "g", "g", "g", "g",
//            "b", "b", "b", "b", "b", "b",
//            "d-5"
//    );
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> map = new HashMap<>();
        for (String item : collection1) {
            String str = null;
            Integer count = 0;
            if (item.contains("[")) {
                str = item.substring(0, 1);
                String countStr = item.substring(item.indexOf("[") + 1, item.indexOf("]"));
                count = Integer.parseInt(countStr);
            } else if (item.contains(":")) {
                String[] strs = item.split(":");
                str = strs[0];
                count = Integer.parseInt(strs[1]);
            } else if (item.contains("-")) {
                String[] strs = item.split("-");
                str = strs[0];
                count = Integer.parseInt(strs[1]);
            } else {
                str = item;
                count = 1;
            }
            if (!map.containsKey(str)) {
                map.put(str, count);
            } else {
                Integer tmp = map.get(str);
                tmp += count;
                map.put(str, tmp);
            }
        }
        return map;
    }

}
