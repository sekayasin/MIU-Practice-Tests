package me.sekayasin;

public class Question21stantonMeasure {

    public static void main(String[] args) {
        System.out.println(stantonMeasure(new int[]{1,3,1,1,3,3,2,3,3,3,4}));
    }

    static int stantonMeasure(int[] a) {
        int stantonMeasure = 0;
        int occurrencesOfOne = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1)
                occurrencesOfOne++;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == occurrencesOfOne)
                stantonMeasure++;
        }

        return stantonMeasure;
    }
}
