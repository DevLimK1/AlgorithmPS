package thisiscodingtest.이진탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 순차탐색 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("생성할 원소 개수를 입력한 다음 한 칸 띄고 찾을 문자열을 입력하세요.");
        StringTokenizer stk=new StringTokenizer(br.readLine());
        //원소 개수
        int n = Integer.parseInt(stk.nextToken());
        //찾고자 하는 문자열
        String target=stk.nextToken();

        System.out.println("앞서 적은 원소 개수만큼 문자열을 입력하세요. 구분은 띄어쓰기 한 칸으로 합니다.");
        String[] arr=new String[n];
        stk=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]= stk.nextToken();
        }

        //순차 탐색
        System.out.println(sequantialSearch(n,target,arr));

    }

    private static int sequantialSearch(int n, String target, String[] arr) {
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
            //현재의 원소가 찾고자 하는 원소와 동일한 경우
            if(arr[i].equals(target))
                return i+1;
        }
        return -1;
    }
}
