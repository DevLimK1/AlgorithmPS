package thisiscodingtest.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//https://www.youtube.com/watch?v=KGyK-pNvWos 40분
public class 두배열의원소교체 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N과 K를 입력받기
        int n = sc.nextInt();
        int k = sc.nextInt();

        // 배열 A의 모든 원소를 입력받기
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // 배열 B의 모든 원소를 입력받기
        Integer[] b = new Integer[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        //배열 a는 오름차순 정렬
        Arrays.sort(a);
        //배열 b는 내림차순 정렬
        Arrays.sort(b, Collections.reverseOrder());

        for(int i=0;i<k;i++){
            //A의 원소가 B의 원소보다 작은 경우
            if(a[i]<b[i]){
                //두 원소 교체
                int temp=a[i];
                a[i]=b[i];
                b[i]=temp;
            }
            else
                break;
        }

        //배열 A 모든 원소 합 출력
        long result=0;
        for(int val:a)
            result+=val;

        System.out.println(result);

    }
}
