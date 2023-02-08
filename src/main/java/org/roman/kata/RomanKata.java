package org.roman.kata;

public class RomanKata {

    public static final int ZERO = 0;
    public static final int MAX_VALUE = 3000;

    public static final  int[] values = {1000, 500, 100, 50, 10,9, 5, 4, 1}; // int values
    public static final  String[] romanLiterals = {"M", "D", "C", "L", "X","IX" ,"V", "IV", "I"}; // respective roman character

    public String convertToRoman(int intValue) { //200 CC

        if (intValue <= ZERO || intValue >= MAX_VALUE) {
            throw new IllegalArgumentException("Enter a valid Integer from 1 to 3,000");
        }
        StringBuilder romanValue = new StringBuilder();
        for (int i = 0; i < values.length; i++) { // loop through int array to get the max roman character
            while (intValue >= values[i]) {  // 200>1000; 200>500; 200>100 = C
                intValue -= values[i]; // intValue = 200 - 100 = 100
                romanValue.append(romanLiterals[i]); // C; remaining 100
            }
        }
        return romanValue.toString();
    }
}
