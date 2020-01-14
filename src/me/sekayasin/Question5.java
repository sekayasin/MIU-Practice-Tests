package me.sekayasin;

import java.util.Arrays;

public class Question5 {

    public static void main(String[] args) {
        System.out.println(commonElements(new int[]{1,8,3,2}, new int[]{2,6,1}));
    }

    static String commonElements(int[] firstArray, int[] secondArray) {
        if (firstArray == null || secondArray == null)
            return null;
        if (firstArray.length == 0 || secondArray.length == 0)
            return Arrays.toString(new int[0]);
        int min = (firstArray.length < secondArray.length) ? firstArray.length : secondArray.length;
        int[] firstClone, secondClone;
        if (min == firstArray.length) {
            firstClone = firstArray;
            secondClone = secondArray;
        } else {
            firstClone = secondArray;
            secondClone = firstArray;
        }
        int[] retArray = new int[min];
        int count = 0;
        for (int i = 0; i < firstClone.length; i++){
            for (int j = 0; j < secondClone.length; j++) {
                if (firstClone[i] == secondClone[j]) {
                    retArray[count] = firstClone[i];
                    count++;
                }
            }
        }
        int[] commonElements = new int[count];
        for (int i = 0; i < commonElements.length; i++) {
            commonElements[i] = retArray[i];
        }

        return Arrays.toString(commonElements);
    }
}
