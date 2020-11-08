package thisiscodingtest.dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class 효율적인화폐구성 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        //N개 화폐 단위 정보 입력
        int[] arr=new int[n];
        for(int i=0;i<n;i++)    {
            arr[i] = sc.nextInt();
        }

        //앞서 계산된 결과 저장
        int[] dp=new int[m+1];
        Arrays.fill(dp,10001);

        //dynamic bottom up
        dp[0]=0;
        for(int i=0;i<n;i++){
            for(int j=arr[i];j<=m;j++){
                //(i-k)원을 만드는 방법이 존재하는 경우
                if(dp[j-arr[i]]!=10001)
                    dp[j]=Math.min(dp[j],dp[j-arr[i]]+1);
            }
        }

        //계산 결과 출력
        if(dp[m]==10001)
            System.out.println(-1);
        else
            System.out.println(dp[m]);


    }
}
