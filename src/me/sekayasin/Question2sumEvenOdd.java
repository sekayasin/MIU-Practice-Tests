package me.sekayasin;

public class Question2sumEvenOdd {

    public static void main(String[] args) {
        System.out.println(sumEvenOdd(new int[]{1,2,3,4}));
    }

    static int sumEvenOdd(int[] items) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < items.length; i++) {
            if (items[i] % 2 == 0)
                sumEven += items[i];
            else
                sumOdd += items[i];
        }
        return sumOdd - sumEven;
    }
}
