package me.sekayasin;

public class Question12isBean {

    public static void main(String[] args) {
        System.out.println(isBean(new int[]{3,8,4}));
    }

    static int isBean(int[] a) {
        int isBean = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == 2*a[j] || a[i] == 2*a[j] + 1 || a[i] == a[j]/2) {
                    isBean = 1;
                    break;
                }
            }
            return isBean;
        }
        return isBean;
    }
}
