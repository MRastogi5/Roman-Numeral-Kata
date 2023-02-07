package org.roman.kata;

import java.util.HashMap;
import java.util.Map;

public class RomanKata {

    public String convertToRoman(int integerValue) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500,"D")
        map.put(1000, "M");

        return map.get(integerValue);
    }
}
