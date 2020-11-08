package TIL.Array;

import java.util.Arrays;

public class 합계에맞는한쌍구하기_twopointer {
    public static void main(String[] args) {
        prettyPrint(new int[]{12, 14, 17, 15, 19, 20, -11}, 9);
        prettyPrint(new int[]{2, 4, 7, 5, 9, 10, -1}, 9);

    }

    private static void prettyPrint(int[] random, int k) {
        System.out.println("input int array : " + Arrays.toString(random));
        System.out.println("All pairs in an array of integers whose sum is equal to a given value " + k);

        printPairsUsingTwoPointers(random, k);
    }

    private static void printPairsUsingTwoPointers(int[] numbers, int k) {
        if (numbers.length < 2)
            return;

        Arrays.sort(numbers);

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == k) {
                System.out.printf("(%d, %d) %n", numbers[left],
                        numbers[right]);
                left += 1;
                right -= 1;
            } else if (sum < k)
                left += 1;
            else if (sum > k)
                right -= 1;
        }
    }
}
