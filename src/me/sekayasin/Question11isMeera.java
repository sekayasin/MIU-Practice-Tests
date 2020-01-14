package me.sekayasin;

public class Question11isMeera {

    public static void main(String[] args) {
        System.out.println(isMeera(new int[]{9,10,1}));
    }

    static int isMeera(int[] a) {
        int isMeeraArray = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1 || a[i] == 9) {
                if (a[i] == 1) {
                    for (int j = i; j < a.length; j++) {
                        if (a[j] == 9) {
                            isMeeraArray = 1;
                            return isMeeraArray;
                        }
                    }
                    isMeeraArray = 0;
                    return isMeeraArray;
                }
                if (a[i] == 9) {
                    for (int j = i; j < a.length; j++) {
                        if (a[j] == 1) {
                            isMeeraArray = 1;
                            return isMeeraArray;
                        }
                    }
                    isMeeraArray = 0;
                    return isMeeraArray;
                }
            }
        }
        return isMeeraArray;
    }
}
