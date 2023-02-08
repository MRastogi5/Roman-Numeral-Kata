package org.roman.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void checkRomanValueOfNegativeNumber(){
        RomanKata romanKata = new RomanKata();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            romanKata.convertToRoman(-2500);
        });
    }
    @Test
    public void checkRomanValueOfZero(){
        RomanKata romanKata = new RomanKata();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            romanKata.convertToRoman(0);
        });
    }

    @Test
    public void checkRomanValueOf2764(){
        RomanKata romanKata = new RomanKata();

        assertEquals("MMDCCLXIV", romanKata.convertToRoman(2764));
        assertEquals("MMDCCLXIX", romanKata.convertToRoman(2769));
    }

}
