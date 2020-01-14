package me.sekayasin;

public class Question6 {

    public static void main(String[] args) {
        System.out.println(poe(new int[]{1,8,3,7,10,2}));
    }

    static int poe(int[] numbers) {
        if (numbers.length < 3) return -1;
        int i = 0;
        int j = numbers.length - 1;
        int idx = 1;
        int leftSum = numbers[i];
        int rightSum = numbers[j];
        for (int k = 1; k < numbers.length - 2; k++ ){
            if (leftSum < rightSum) {
                i++;
                leftSum += numbers[i];
                idx = i + 1;
            } else {
                j--;
                rightSum += numbers[j];
                idx = j - 1;
            }
        }
        if (leftSum == rightSum)
            return idx;
        else
            return -1;
    }

}
