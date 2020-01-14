package me.sekayasin;

public class Question4 {

    public static void main (String[] args) {
        System.out.println(reverseIntWithNumericOps(23));
    }

    static int reverseIntWithNumericOps(int number) {
        int sign = 1;
        if (number == 0) return 0;
        if (number < 0) {
            sign = -1;
            number = -number;
        }
        int reverse = 0;
        while (number != 0) {
            reverse = (reverse * 10) + (number % 10);
            number /= 10;
        }
        return sign * reverse;
    }
}
