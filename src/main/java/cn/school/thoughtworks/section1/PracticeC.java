package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> resltList=new ArrayList<>();
        List<String> c2=collection2.get("value");
        for (int i = 0; i < collection1.size(); i++) {
            String k=collection1.get(i);
            if (c2.contains(k)) {
                resltList.add(k);
            }
        }
        return resltList;

    }
}
