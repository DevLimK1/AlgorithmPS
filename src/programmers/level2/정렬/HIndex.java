package programmers.level2.정렬;

import java.util.Arrays;

/*https://taesan94.tistory.com/58 설명 참고*/
public class HIndex {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i=0; i<citations.length; i++){
            int smaller = Math.min(citations[i], citations.length-i);
            answer = Math.max(answer, smaller);
        }
        return answer;
    }
}
