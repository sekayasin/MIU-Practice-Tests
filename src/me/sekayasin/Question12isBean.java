package me.sekayasin;

public class Question12isBean {

    public static void main(String[] args) {
        System.out.println(isBean(new int[]{3,8,4}));
    }

     static int isBean(int[] a) {

        for (int i = 0; i < a.length; i++) {
            boolean pass=false;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == 2*a[i] || a[j] == 2*a[i] + 1 || a[j] == a[i]/2) {
                    pass=true;
                    break;
                }
            }
            if (!pass) return 0; 
            
        }
        return 1;
    }
}
