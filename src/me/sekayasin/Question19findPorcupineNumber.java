package me.sekayasin;

public class Question19findPorcupineNumber {

    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(140));
    }

    static int findPorcupineNumber(int number) {
        int porcupineNumber = 0;
        int maxValue = Integer.MAX_VALUE;
        boolean isPorcupineNumber = false;
        number++;

        while (number <= maxValue) {
            if (isPorcupineNumber) {
                if (isPrime(number) == 1) {
                    if (number % 10 == 9) break;
                    else isPorcupineNumber = false;
                }
            } else {
                if (isPrime(number) == 1) {
                    if (number % 10 == 9) {
                        isPorcupineNumber = true;
                        porcupineNumber = number;
                    }
                }
            }
            number++;
        }
        return porcupineNumber;
    }

    static int isPrime(int number) {
        int isPrime = 0;
        if (number > 1) {
            isPrime = 1;
            for (int i = 2; i*2 <= number; i++) {
                if (number % i == 0) {
                    isPrime = 0;
                    break;
                }
            }
        }
        return isPrime;
    }
}
