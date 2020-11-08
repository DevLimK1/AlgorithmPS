package thisiscodingtest.sort;

//https://github.com/ndb796/python-for-coding-test/blob/master/6/6.java
public class 계수정렬 {
    public static final int MAX_VALUE=9;

    public static void main(String[] args) {
        int n=15;
        //모든 원소의 값이 0보다 크거나 같다고 가정
        int[] arr = {7, 5, 9, 0, 4, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};

        //모든 범위 포함하는 배열 선언
        int[] cnt=new int[MAX_VALUE+1];

        for(int i=0;i<n;i++){
            cnt[arr[i]]+=1;
        }
        for(int i=0;i<MAX_VALUE;i++){
            for(int j=0;j<cnt[i];j++){
                System.out.print(i+" ");
            }
        }

    }
}
