package TIL.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 합계에맞는한쌍구하기_set {
    public static void main(String[] args) {
        prettyPrint(getRandomArray(9), 11);
        prettyPrint(getRandomArray(10), 12);
    }

    private static void prettyPrint(int[] random, int k) {
        System.out.println("Random Integer array : " + Arrays.toString(random));
        System.out.println("Sum : " + k);
        System.out.println("pair of numbers from an array whose sum equals " + k);
        printPairsUsingSet(random, k);
    }

    private static void printPairsUsingSet(int[] numbers, int n) {
        if (numbers.length < 2)
            return;

        Set set = new HashSet<>(numbers.length);

        for(int value : numbers){
            int target=n-value;

            if(!set.contains(target)){
                set.add(value);
            }else{
                System.out.printf("(%d, %d) %n", value, target);
            }
        }
    }

    private static int[] getRandomArray(int length) {
        int[] randoms = new int[length];
        for (int i = 0; i < length; i++) {
            randoms[i] = (int) (Math.random() * 15);
        }
        return randoms;
    }
}
