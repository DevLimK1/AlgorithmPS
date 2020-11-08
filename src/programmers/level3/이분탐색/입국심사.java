package programmers.level3.이분탐색;

public class 입국심사 {
    public long solution(int n, int[] times) {

        long answer = Long.MAX_VALUE;
        long left = 0;
        long right = 0;
        long mid;

        for (int time : times) { //가장 긴 상담시간이 right
            if (time > right) {
                right = time;
            }
        }

        right *= n; //가장 긴 상담시간*상담 받을 인원

        while (left <= right) { //이분 탐색
            long done = 0;
            mid = (left + right) / 2;

            for (int time : times) {
                done += mid / time;
            }

            if (done < n) { // 해당 시간동안 심사를 다 하지 못한 경우
                left = mid + 1;
            }
            else { // 시간이 여유있거나, 딱 맞는 경우
                if (mid < answer) { // 가장 짧은 시간을 찾아야하므로
                    answer = mid;
                }
                right = mid - 1;
            }
         }

        return answer;
    }
}
