package me.sekayasin;

public class Question17isInertial {

    public static void main(String[] args) {
        System.out.println(isInertial(new int[]{1,2,3,4}));
    }

    static String isInertial(int[] a){
        int isInertial = 1;
        int hasAtleastOneOdd = 0;
        int maxNumberIsEven = 0;
        int maxNumber = a[0];
        int lengthOdd = 0;
        int lengthEven = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1 || a[i] % 2 == -1) {
                hasAtleastOneOdd = 1;
                lengthOdd++;
            } else lengthEven++;
        }
        if (hasAtleastOneOdd == 0) return 0 + " no odd value";

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    if (a[i] > maxNumber) maxNumber = a[i];
                }
            }
        }
        if (maxNumber % 2 == 0 || maxNumber % 2 == -0) {
            maxNumberIsEven = 1;
        }
        if (maxNumberIsEven == 0) return 0 + " max number is not even, " + maxNumber + " is the max number";

        int[] oddValues = new int[lengthOdd];
        int[] evenValues = new int[lengthEven];
        int oddIdx = 0;
        int evenIdx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 || a[i] % 2 == -0) {
                evenValues[evenIdx] = a[i];
                evenIdx++;
            } else {
                oddValues[oddIdx] = a[i];
                oddIdx++;
            }
        }

        for (int i = 0; i < oddValues.length; i++) {
            for (int j = 0; j < evenValues.length; j++) {
                if (evenValues[j] != maxNumber) {
                    if (oddValues[i] < evenValues[j]) {
                        isInertial = 0;
                        return isInertial + " some odd value is not greater than some even value which is not the Max number";
                    }
                }
            }
        }
        return isInertial + " is Intertial";
    }
}
