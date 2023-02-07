package org.roman.kata;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanKataTest {

    @Test
    public void checkRomanValueOfOne(){
        RomanKata romanKata = new RomanKata();
        assertEquals("I", romanKata.convertToRoman(1));
    }

    @Test
    public void checkRomanValueOfFive(){
        RomanKata romanKata = new RomanKata();
        assertEquals("V", romanKata.convertToRoman(5));
    }

    @Test
    public void checkRomanValueOfThree(){
        RomanKata romanKata = new RomanKata();
        assertEquals("X", romanKata.convertToRoman(10));
    }

    @Test
    public void checkRomanValueOfTwenty(){
        RomanKata romanKata = new RomanKata();
        assertEquals("XX", romanKata.convertToRoman(20));
    }

    @Test
    public void checkRomanValueOfTwoHundred(){
        RomanKata romanKata = new RomanKata();
        assertEquals("CC", romanKata.convertToRoman(200));
    }

    @Test
    public void checkRomanValueOfTwentyFiveHundred(){
        RomanKata romanKata = new RomanKata();
        assertEquals("MMD", romanKata.convertToRoman(2500));
    }
}
