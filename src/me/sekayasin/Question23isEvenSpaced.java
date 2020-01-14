package me.sekayasin;

public class Question23isEvenSpaced {

    public static void main(String[] args) {
        System.out.println(isEvenSpaced(new int[]{80,-56,11,-81}));
    }

    static int isEvenSpaced(int[] a) {
        int isEvenSpaced = 0;
        if (a.length < 2) return 0;

        int largestValue = a[0];
        int smallestValue = a[0];

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    if (a[i] > largestValue) largestValue = a[i];
                }
                if (a[i] < a[j]) {
                    if (a[i] < smallestValue) smallestValue = a[i];
                }
            }
        }
        if ((largestValue - smallestValue) % 2 == 0) isEvenSpaced = 1;
        return isEvenSpaced;
    }
}
