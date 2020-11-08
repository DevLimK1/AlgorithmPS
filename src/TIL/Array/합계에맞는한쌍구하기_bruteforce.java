package TIL.Array;

import java.util.Arrays;

//https://javarevisited.blogspot.com/2014/08/how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number-java.html?source=post_page---------------------------&ref=hackernoon.com
public class 합계에맞는한쌍구하기_bruteforce {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 3, 5, 7, 8, 9};
        int[] numbersWithDuplicates = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
        prettyPrint(numbers, 7);
        prettyPrint(numbersWithDuplicates, 7);

    }

    private static void prettyPrint(int[] givenArray, int givenSum) {
        System.out.println("Given array : " + Arrays.toString(givenArray));
        System.out.println("Given sum : " + givenSum);
        System.out.println("Integer numbers, whose sum is equal to value : " + givenSum);
        printPairs(givenArray, givenSum);

    }

    private static void printPairs(int[] givenArray, int givenSum) {
        for(int i=0;i<givenArray.length;i++) {
            int first=givenArray[i];
            for(int j=i+1;j<givenArray.length;j++){
                int second=givenArray[j];

                if((first+second)== givenSum){
                    System.out.printf("(%d,%d) \n",first,second);
                }
            }
        }
    }
}
