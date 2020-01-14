package me.sekayasin;

public class Question14 {

    public static void main(String[] args) {
        System.out.println(mostOccurringNumber(new int[]{6,8,1,8,2}));
    }

    static int mostOccurringNumber(int[] a) {
        int counter = 0;
        int temp = 0;
        int mostOccurredNumber = a[0];
        int newLength = a.length;

        // loop to calculate the size of an array with no Duplicates
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    newLength--;
                    break;
                }
            }
        }

        // now we know the size of the array without duplicates
        int[] newArray = new int[newLength];
        newArray[0] = a[0];
        boolean isDuplicate;
        int idx = 1;

        // loop to populate the newArray with no Duplicates
        for (int i = 1; i < a.length; i++) {
            isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                newArray[idx] = a[i];
                idx++;
            }
        }

        // compare the array with no Duplicates to the original array and return the most occurred number
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (newArray[i] == a[j]) {
                    counter++;
                }
            }
            if (counter >= temp) {
                temp = counter;
                mostOccurredNumber = newArray[i];
            }
            counter = 0;
        }
        return mostOccurredNumber;
    }
}
