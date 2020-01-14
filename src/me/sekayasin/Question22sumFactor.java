package me.sekayasin;

public class Question22sumFactor {

    public static void main(String[] args) {
        System.out.println(sumFactor(new int[]{3,0,2,-5,0}));
    }

    static int sumFactor(int[] a) {
        int sumOfTheArray = 0;
        int sumFactor = 0;

        if (a.length == 0) return 0;

        for (int i = 0; i < a.length; i++) {
            sumOfTheArray += a[i];
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == sumOfTheArray) sumFactor++;
        }

        return sumFactor;
    }
}
