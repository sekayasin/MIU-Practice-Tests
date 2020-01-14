package me.sekayasin;

public class Question1IsCentered {

    public static void main(String[] args) {
        System.out.println(isCentered(new int[]{3,2,1,4,1}));
    }

    static int isCentered(int[] items) {
        if (items.length == 0 || items.length % 2 == 0)
            return 0;
        int midIndex = items.length / 2;
        int middleItem = items[midIndex];
        for (int i = 0; i < items.length; i++) {
            if (i != midIndex && middleItem >= items[i])
                return 0;
        }
        return 1;
    }
}
