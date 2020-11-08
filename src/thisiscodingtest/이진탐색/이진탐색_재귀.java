package thisiscodingtest.이진탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이진탐색_재귀 {
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
        if(start>end)
            return -1;
        int mid=(start+end)/2;
        //찾은 경우 중간점 인덱스 반환
        if(arr[mid]==target)
            return mid;

        //중간점 값보다 찾고자 하는 값이 작은 경우  왼쪽 확인
        else if(arr[mid]>target)
            return binarySearch(arr,target,start,mid-1);
        else
            return binarySearch(arr,target,mid+1,end);
    }
}
