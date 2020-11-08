package programmers.level3.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class 단속카메라 {
    public int solution(int[][] routes) {
        int cameraCnt = 0;
        int min = Integer.MIN_VALUE;

        Arrays.sort(routes, new Comparator<int[]>() {
            public int compare(int[] arg0, int[] arg1) {
                return Integer.compare(arg0[1], arg1[1]); //차량 진출 기준으로 오름 차순 정렬
            }
        });

        for (int[] route : routes) {
            if (min < route[0]) {
                cameraCnt++;
                min = route[1];
            }
        }

        return cameraCnt;
    }

}
/*import java.util.Arrays;

class Solution {
    public int solution(int[][] routes) {
        // 끝나는 시간 순 대로 오름차순 정렬
		Arrays.sort(routes, (a,b)-> Integer.compare(a[1], b[1]));
		int cnt = 0;

		int min = Integer.MIN_VALUE;
		for(int[] route : routes) {
			if(min <  route[0] ) {
				// 전 거의 끝나는 시간 보다 시작 시간이 큰 경우
				// 안 겹치니까 변경하고, 숫자 더하기
				min = route[1];
				++cnt;
			}
		}
        return cnt;
    }
}*/