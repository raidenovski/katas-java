package com.urosht.demo;

import java.util.HashMap;

public class RomanNumerals {


    private static HashMap<Integer, String> numeralsMap = new HashMap<Integer, String>() {{
        put(1, "I");
        put(5, "V");
        put(10, "X");
    }};

    public static String transform(int arabic) {
        String roman = null;
        if (arabic > 1 && arabic < 4) {
            roman = transform(1) + transform(arabic - 1);
        } else if (mustSubtractOne(arabic)) {
            roman = transform(1) + transform(arabic + 1);
        } else if (arabic > 5 && arabic < 9) {
            roman = transform(5) + transform(arabic - 5);
        } else if (arabic > 10 && arabic < 14) {
            roman = transform(10) + transform(arabic - 10);
        } else {
            roman = numeralsMap.get(arabic);
        }
        return roman;
    }

    private static boolean mustSubtractOne(int x) {
        return x % 5 == 4;
    }

    private static boolean mustAddOne(int x) {
        return false;
    }
}
