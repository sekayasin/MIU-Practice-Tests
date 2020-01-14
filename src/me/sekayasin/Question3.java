package me.sekayasin;

import java.util.Arrays;

public class Question3 {

    public static void main(String[] args) {
        System.out.println(charArrayBasedStartLength(new char[]{'a','b', 'c'}, 1, 2));
    }

    static String charArrayBasedStartLength(char[] chars, int start, int len) {
        if (len < 0 ||start < 0 || start + len - 1 >= chars.length)
            return null;
        char[] newChars = new char[len];
        for(int i = start, j = 0; j < len; i++, j++){
            newChars[j] = chars[i];
        }
        return Arrays.toString(newChars);
    }
}
