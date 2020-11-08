package TIL.Array;

import java.util.Arrays;

public class collection없이중복없애기 {
    public static void main(String args[]) {

        int[][] test = new int[][]{
                {1, 1, 2, 2, 3, 4, 5},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},};

        for (int[] input : test) {
            System.out.println("Array with Duplicates       : " + Arrays.toString(input));
            System.out.println("After removing duplicates   : " + Arrays.toString(removeDuplicates(input)));
        }
        

    }

    private static int[] removeDuplicates(int[] numberWithDuplicates) {

        Arrays.sort(numberWithDuplicates);

        int[] result=new int[numberWithDuplicates.length];
        int previous=numberWithDuplicates[0];
        result[0]=previous;

        for(int i=1;i<numberWithDuplicates.length;i++){
            int ch=numberWithDuplicates[i];

            if(previous!=ch){
                result[i]=ch;
            }
            previous=ch;
        }

        return result;

    }


}
