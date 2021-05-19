package com.company;

import java.util.Locale;

public class workingWithStrings {

    //1. Given a string, return a string length 1 from its front, unless front is false, in which case return a string
    // length 1 from its back. The string will be non-empty.
    public static String theEnd(String inputString, boolean bool) {
        String result;
        if (bool) {
            result = inputString.substring(0, 1);
        } else {
            result = inputString.substring(inputString.length() - 1);
        }
        return result;
    }

    // 2. Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
    // The string may be any length. If there are fewer than 2 chars, use whatever is there.
    public static String extraFront(String inputText) {
        String result;
        String chars = inputText.substring(0, 2);
        result = chars.repeat(3);
        //result = chars.concat(chars.concat(chars));
        return result;
    }

    //     3. Given a string, return a string where for every char in the original, there are two chars.
    public static String doubleChar(String inputString) {
        String result = "";
        for (int i = 0; i < inputString.length(); i++) {
            String str = Character.toString(inputString.charAt(i));
            result = result.concat(str.repeat(2));
        }
        return result;
    }

    //      4. Given a string, return true if the number of appearances of "is" anywhere in the string
    //      is equal to the number of appearances of "not" anywhere in the string.
    public static boolean equalIsNot(String inputText) {
        boolean bool = false;
        String text = inputText.toLowerCase(Locale.ROOT);
        String str1 = "is";
        String str2 = "not";
        int is = 0;
        int not = 0;
        for (int i = 0; i <= text.length() - 3; i++) {
            if (text.substring(i, i + 2).equals(str1)) {
                is++;
            } else if (text.substring(i, i + 3).equals(str2)) {
                not++;
            }
        }
        if (is == not) bool = true;
        return bool;

    }

    //     5. Create a function that takes a string and returns a new string with each new character accumulating by +1.
    // Separate each set with a dash.
    public static String accumulatingChars(String inputString) {
        String result = "";

        for (int i = 0; i < inputString.length(); i++) {
            String str = Character.toString(inputString.charAt(i));
            str = str.toUpperCase(Locale.ROOT).concat(str.repeat(i));
            result = result.concat(str.concat("-"));
        }
        return result.substring(0, result.length() - 1);
    }

    //      6. Create a function that returns a capitalized version of the string passed.
    //      The first letter of each word in the string should be capitalized while the rest should be in lowercase.
    public static String emphasizeString(String inputString) {
        String result = "";
        String[] split = inputString.split(" ");
        for (int i = 0; i <= countChar(inputString, ' '); i++) {
            String temp1 = split[i].substring(0, 1).toUpperCase(Locale.ROOT);
            String temp2 = split[i].substring(1).toLowerCase(Locale.ROOT);
            result = result.concat(temp1.concat(temp2.concat(" ")));
        }
        return result;
    }

    public static int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                count++;
        }
        return count;
    }

}
