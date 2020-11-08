package TIL.정렬;

public class SelectionSort {
    private static int[] input={5,6,2,8,7,23,4,1};
    private static int[] input2={5,6,2,8,7,23,4,1};

    public static void main(String[] args) {

        selectionAscSortMin(input,input.length); //작은 숫자를 선택하여 앞에서 채워지면서 오름차순 정렬
        for(int a:input){
            System.out.print(a+" ");
        }
        System.out.println();

        selectionAscSortMax(input2,input.length);//큰 숫자를 선택하여 뒤에서 채워지면서 오름차순 정렬
        for(int a:input2){
            System.out.print(a+" ");
        }

        System.out.println();

        selectionDescSortMax(input2,input.length);//큰 숫자를 선택하여 앞에서 채워지면서 내림차순 정렬
        for(int a:input2){
            System.out.print(a+" ");
        }

        System.out.println();

        selectionDescSortMin(input,input.length); //작은 숫자를 선택하여 뒤에서 채워지면서 내림차순 정렬
        for(int a:input){
            System.out.print(a+" ");
        }
    }

    private static void selectionDescSortMin(int[] input, int length) {//작은 숫자를 선택하여 뒤에서 채워지면서 내림차순 정렬
        int min;
        int tmp;

        for(int i=length-1;i>0;i--){//맨 뒤부터 채워지기 위하여
            min=i;
            for(int j=i-1;j>=0;j--){
                if(input[j]<input[min]){
                    min=j;
                }
            }
            tmp=input[i];
            input[i]=input[min];
            input[min]=tmp;
        }
    }

    private static void selectionDescSortMax(int[] input2, int length) { //큰 숫자를 선택하여 앞에서 채워지면서 내림차순 정렬
        int max;
        int tmp;
        for(int i=0;i<length-1;i++){
            max=i;
            for(int j=i+1;j<length;j++){
                if(input2[j]>input2[max])
                    max=j;
            }
            tmp=input2[i];
            input2[i]=input2[max];
            input2[max]=tmp;
        }
    }

    private static void selectionAscSortMax(int[] input2, int length) { //맨 뒤부터 큰 값으로 채워짐
        int max;
        int tmp;

        for(int i=length-1;i>0;i--){
            max=i;
            for(int j=i-1;j>=0;j--){
                if(input2[j]>input2[max]){
                    max=j;
                }
            }
            tmp=input2[i];
            input2[i]=input2[max];
            input2[max]=tmp;
        }
    }

    private static void selectionAscSortMin(int[] input, int length) {//맨 앞부터 작은 값이 채워짐
        int min;
        int tmp;
        for(int i=0;i<length-1;i++){
            min=i;
            for(int j=i+1;j<length;j++){
                if(input[j]<input[min])
                    min=j;
            }
            tmp=input[i];
            input[i]=input[min];
            input[min]=tmp;
        }
    }

}
