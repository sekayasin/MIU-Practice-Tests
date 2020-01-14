package me.sekayasin;

public class Question7nextPerfectSquare {

    public static void main(String[] args) {
        System.out.println(nextPerfectSquare(8));
    }

    static int nextPerfectSquare(int number) {
        int nextPerfectSquare = 0;

        if (number >= 0) {
            double sqrtResult = Math.sqrt(number);
            int baseNumber = (int) sqrtResult;
            int nextNumber = baseNumber + 1;
            nextPerfectSquare = (int) Math.pow(nextNumber, 2);
        }

        return nextPerfectSquare;
    }
}
