package thisiscodingtest.sort;

import java.util.Arrays;

//https://heekim0719.tistory.com/282?category=790042
public class 퀵정렬 {
    public static void main(String[] args) {
        int[] array = {4, 2, 3, 5, 9,11,1,6};
        array = quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }

    private static int[] quickSort(int[] array, int start, int end) {
        int p=partition(array,start,end);
        if(start<p-1)
            quickSort(array,start,p-1);
        if(p<end)
            quickSort(array,p,end);
        return array;
    }

    private static int partition(int[] array, int start, int end) {
        int pivot=array[(start+end)/2];
        while(start<=end){
            while(array[start]<pivot)
                start++;
            while(array[end]>pivot)
                end--;
            if (start <= end) {
                int tmp=array[start];
                array[start]=array[end];
                array[end]=tmp;
                start++;
                end--;
            }
        }
        return start;
    }
}
