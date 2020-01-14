package me.sekayasin;

public class Question24isSub {

    public static void main(String[] args) {
        System.out.println(isSub(new int[]{13,6,3,2}));
    }

    static int isSub(int[] a) {
        int isSubArray = 0;
        int sumAfterElements = 0;

        for (int i = 0; i < a.length; i++) {
            isSubArray = 1;
            for (int j = i+1; j < a.length; j++) {
                sumAfterElements += a[j];
            }

            if (a[i] <= sumAfterElements) {
                isSubArray = 0;
                return isSubArray;
            }
            sumAfterElements = 0;
        }

        return isSubArray;
    }
}
