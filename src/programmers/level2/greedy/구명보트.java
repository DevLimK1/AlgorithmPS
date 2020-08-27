package programmers.level2.greedy;

import java.util.Arrays;

public class 구명보트 {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int min = 0;

        for (int max = people.length - 1; max>=min; max--){
            if (people[min] + people[max] <= limit) min++;//제한보다 작으면
            answer++;
        }

        return answer;
    }
}
