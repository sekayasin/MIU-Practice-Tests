package me.sekayasin;

public class Question11isMeera {

    public static void main(String[] args) {
        System.out.println(isMeera(new int[]{9,10,1}));
    }

    static int isMeera(int[] a) {
        boolean isOnePresent = false;
        boolean isNinePresent =false;

        for (int i = 0; i < a.length; i++) {
            if(a[i]==1) isOnePresent=true;
            if(a[i]==9) isNinePresent=true;
            if(isOnePresent && isNinePresent) return 1;

        }
        return 0;
}
