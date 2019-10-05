package com.xiang.leetcode;

/**
 * Created by xiangrui on 2019-09-11.
 *
 * @author xiangrui
 * @date 2019-09-11
 */
public class IntegerValueOf {

    public static int strToInt(String string) {
        if (string == null || string.isEmpty()) {
            return 0;
        }

        char[] chars = string.toCharArray();

        char aChar = chars[0];
        boolean nev = aChar == '-';
        int start = aChar == '-' || aChar == '+' ? 1 : 0;

        int result = 0;
        for (int i = start; i < chars.length; i++) {
            char aChar1 = chars[i];
            if (Character.isDigit(aChar1)) {
                int temp = Character.digit(aChar1, 10);
                result = (result * 10 + temp);
            } else {
                return 0;
            }
        }
        return nev ? -result : result;
    }

}
