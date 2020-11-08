package programmers.level2.greedy;

import java.util.Arrays;

public class 구명보트Practice {
    public int solution(int[] people, int limit) {
        int answer=0;

        Arrays.sort(people);
        int min=0;

        for(int max=people.length-1;max>=min;max--){
            if(people[max]+people[min]<=limit)
                min++;
            answer++;
        }

        return answer;
    }

}
