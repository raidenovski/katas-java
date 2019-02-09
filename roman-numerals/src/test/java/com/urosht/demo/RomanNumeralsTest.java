package com.urosht.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RomanNumeralsTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {1, "I"}, {2, "II"}, {3, "III"}, {4, "IV"},
                {5, "V"}, {6, "VI"}, {7, "VII"}, {8, "VIII"},
                {9, "IX"}, {10, "X"}, {11, "XI"}, {12, "XII"},
                {13, "XIII"}, {14, "XIV"}
        });
    }

    private int arabic;
    private String roman;

    public RomanNumeralsTest(int arabic, String roman) {
        this.arabic = arabic;
        this.roman = roman;
    }

    @Test
    public void givenArabicNumber_whenParsing_thenReturnRoman() {
        Assert.assertEquals(roman, RomanNumerals.transform(arabic));
    }
}
