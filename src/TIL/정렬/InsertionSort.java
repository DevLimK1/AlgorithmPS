package TIL.정렬;

public class InsertionSort {
    private static int[] input = {5, 6, 2, 8, 7, 23, 4, 1, 44};

    public static void main(String[] args) {
        insertionSort(input, input.length);
        for (int a : input) {
            System.out.print(a + " ");
        }
    }

    private static void insertionSort(int[] input, int length) {
        int tmp;

        for(int end=1;end<input.length;end++){
            for(int i=end;i>0;i--){
                if(input[i-1]>input[i]){
                    tmp=input[i-1];
                    input[i-1]=input[i];
                    input[i]=tmp;
                }
            }
        }

    }


}
