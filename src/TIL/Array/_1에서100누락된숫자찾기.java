package TIL.Array;

import java.util.Arrays;
import java.util.BitSet;

public class _1에서100누락된숫자찾기 {

    public static void main(String[] args) {

//        one missing number
        printMissingNumber(new int[]{1, 2, 4, 5}, 5);

        //two missing number
        printMissingNumber(new int[]{2, 4, 1}, 5);

        //Only one missing number in array.
        int[] iArray = new int[]{1, 2, 3, 5};
        int missing = getMissingNumber(iArray, 5);
        System.out.printf("Missing number in array %s is %d %n",
                Arrays.toString(iArray), missing);
    }

    private static int getMissingNumber(int[] numbers, int totalCount) {
        int expectedSum = (totalCount * (totalCount + 1)) / 2;
        int actualSum = 0;

        for (int i : numbers) {
            actualSum += i;
        }

        return expectedSum - actualSum;
    }

    private static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length; //누락된 숫자 갯수
        BitSet bitSet = new BitSet(count);

        for (int number : numbers) {
            bitSet.set(number - 1);
        }
        System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(numbers), count);

        int lastMissingIndex = 0;

        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex); //인덱스가 0부터 시작됨으로 +1를 해줘야한다.
        }
    }
}
