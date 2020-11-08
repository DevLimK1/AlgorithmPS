package thisiscodingtest.이진탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 떡볶이떡만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stk=new StringTokenizer(br.readLine());
        //떡의 개수(n)와 요청한 떡의 길이(m)
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        //각 떡의 개별 높이 정보
        int[] arr= new int[n];
        stk=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]= Integer.parseInt(stk.nextToken());
        }

        //이진 탐색 위한 시작점과 끝점 설정
        int start=0;
        int end= (int) 1e9;
        //이진 탐색 수행(반복적)
        int result=0;
        while(start<=end){
            long total=0;
            int mid=(start+end)/2;
            for(int i=0;i<n;i++){
                //잘랐을 때 떡의 양 계산
                if(arr[i]>mid)
                    total+=arr[i]-mid;
            }
            if (total < m) {//떡의 양이 부족한 경우 더 많이 자르기(왼쪽 부분 탐색)
                end=mid-1;
            }
            else{//떡의 양이 충분한 경우 덜 자르기(오른쪽 부분 탐색)
                result=mid;//최대한 덜 잘랐을 떄가 정답
                start=mid+1;
            }
        }
        System.out.println(result);
    }
}
