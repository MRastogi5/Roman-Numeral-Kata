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
    public void checkRomanValueOfTen(){
        RomanKata romanKata = new RomanKata();
        assertEquals("X", romanKata.convertToRoman(10));
    }
}
