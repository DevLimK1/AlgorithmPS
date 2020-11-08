package thisiscodingtest.이진탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이진탐색_반복문 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("생성할 원소 개수를 입력한 다음 한 칸 띄고 찾을 문자열을 입력하세요.");
        StringTokenizer stk = new StringTokenizer(br.readLine());
        //원소 개수
        int n = Integer.parseInt(stk.nextToken());
        //찾고자 하는 문자열
        int target = Integer.parseInt(stk.nextToken());

        //전체 원소 입력받기
        int[] arr = new int[n];
        stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }

        //이진 탐색 수행 결과 출력
        int result = binarySearch(arr, target, 0, n - 1);
        if(result==-1){
            System.out.println("원소가 존재하지 않습니다.");
        }
        else
            System.out.println(result+1);

    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
}
