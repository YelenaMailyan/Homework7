package com.company;

public class Main extends workingWithStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "world";
        String result1_0 = workingWithStrings.theEnd(str1, true);
        String result1_1 = workingWithStrings.theEnd(str1, false);
        String result1_2 = workingWithStrings.theEnd(str2, true);
        String result1_3 = workingWithStrings.theEnd(str2, false);
        System.out.println("theEnd(" + str1+","+ true+")➞ " + result1_0);
        System.out.println("theEnd(" + str1+","+ false+")➞ " + result1_1);
        System.out.println("theEnd(" + str2+","+ true+")➞ " + result1_2);
        System.out.println("theEnd(" + str2+","+ false+")➞ " + result1_3);
        System.out.println("_______________");

        String result2 = workingWithStrings.extraFront(str2);
        System.out.println("extraFront(" + str2 + ")➞ " + result2);
        System.out.println("_______________");

        String result3 = workingWithStrings.doubleChar(str2);
        System.out.println("doubleChar(" + str2 + ")➞ " + result3);
        System.out.println("_______________");

        String str4_0 = " He is nota  student";
        String str4_1 = "She is a student";
        String str4_2 = "He isis a Not not student";
        boolean result4_0 = workingWithStrings.equalIsNot(str4_0);
        boolean result4_1 = workingWithStrings.equalIsNot(str4_1);
        boolean result4_2 = workingWithStrings.equalIsNot(str4_2);
        System.out.println("equalIsNot(" + str4_0 + ")➞ " + result4_0);
        System.out.println("equalIsNot(" + str4_1 + ")➞ " + result4_1);
        System.out.println("equalIsNot(" + str4_2 + ")➞ " + result4_2);
        System.out.println("_______________");

        String str5 = "haPPy BdaY";
        String result5 = workingWithStrings.accumulatingChars(str5);
        System.out.println("accum(" + str5 + ")➞ " + result5);
        System.out.println("_______________");
        String str6 = "GOOD mOOrninG anD goOD dAy, have fun !";
        String result6 = workingWithStrings.emphasizeString(str6);
        System.out.println("emphasize(" + str6 + ")➞ " + result6);

    }


}