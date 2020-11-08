package thisiscodingtest.dynamic;

import java.util.Scanner;

//https://github.com/ndb796/python-for-coding-test/blob/master/8/6.java
public class 개미전사 {
    //앞서 계산된 결과를 저장하기 위한 DP 테이블 초기화
    public static int[] dp=new int[100];

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        //모든 식량 정보 입력
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //dynamic bottom up
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i]);
        }

        //계산 결과 출력
        System.out.println(dp[n-1]);
    }
}
