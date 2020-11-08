package thisiscodingtest.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*https://www.youtube.com/watch?v=g4nfN7Jw-yg&list=PLRx0vPvlEmdBFBFOoK649FlEMouHISo8N&index=2
* 28분 때 문제*/
public class _1이될때까지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk=new StringTokenizer(br.readLine());

        int n= Integer.parseInt(stk.nextToken());
        int k= Integer.parseInt(stk.nextToken());
        int result=0;

        while(true){
            //n이 k로 나누어 떨어지는 수가 될 때까지만 1씩 빼기
            int target=(n/k)*k;
            result+=(n-target);
            n = target;
            // N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
            if (n < k) break;
            // K로 나누기
            result += 1;
            n /= k;
        }

        // 마지막으로 남은 수에 대하여 1씩 빼기
        result += (n - 1);
        System.out.println(result);
    }

}
