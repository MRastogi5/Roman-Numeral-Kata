package org.roman.kata;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RomanKata {

    public String convertToRoman(int intValue) { //200 CC

        int[] values = {1000, 500, 100, 50, 10, 5, 1}; // int values
        char[] romanLiterals = {'M', 'D', 'C', 'L', 'X', 'V', 'I'}; // respective roman character


        StringBuilder s = new StringBuilder();
        for (int i = 0; i < values.length; i++) { // loop through int array to get the max roman character
            while (intValue >= values[i]) {  // 200>1000; 200>500; 200>100 = C
                intValue -= values[i]; // intValue = 200 - 100 = 100
                s.append(romanLiterals[i]); // C 
            }
        }

        return s.toString();
    }
}
