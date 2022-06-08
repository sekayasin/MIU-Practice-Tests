public class Question8nUpCount {

    public static void main(String[] args) {
        System.out.println(nUpCount(new int[]{2,3,1,-6,8,-3,-1,2}, 5));
    }

    static int nUpCount(int[] numbers, int number) {
        int upCount = 0;
        int previousPartialSum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
           
            int currentPartialSum =previousPartialSum + numbers[i];
            if (previousPartialSum <= number && currentPartialSum > number) {
                upCount += 1;
            }
            previousPartialSum = currentPartialSum;
        }
        return upCount;
    }
}
