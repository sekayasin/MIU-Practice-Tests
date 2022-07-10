package me.sekayasin;

public class Question13 {

    public static void main(String[] args) {
        System.out.println(expressedAsSumOfTwoSquares(20));
    }

    static String expressedAsSumOfTwoSquares(int n) {
        int wayNum = 0;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++) {
                if (n == i * i + j * j)
                    wayNum++;
            }
        }
        return wayNum == 2;
    }
}
