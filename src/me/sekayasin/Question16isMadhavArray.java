package me.sekayasin;

public class Question16isMadhavArray {

    public static void main(String[] args) {
        System.out.println(isMadhavArray(new int[]{2,1,1}));
    }

    static int isMadhavArray(int[] a) {
        int isMadhav = 1;
        int isMadhavLength = 0;

        if (a.length < 3) return 0;

        for (int i = 1; i <= a.length; i++) {
            if (a.length == i*(i+1)/2) {
                isMadhavLength = 1;
            }
        }
        if (isMadhavLength == 0) return 0;

        int startIndex = 1;
        int round = 1;
        int endIndex = startIndex + round;
        int firstValue = a[0];

        while (isMadhav == 1 && endIndex <= a.length) {
            int sum = 0;
            for (int i = startIndex; i <= endIndex; i++) {
                sum += a[i];
            }
            if (firstValue != sum)
                isMadhav = 0;

            round++;
            startIndex = endIndex + 1;
            endIndex = startIndex + round;
        }
        return isMadhav;
    }
}
