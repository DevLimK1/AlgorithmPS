package programmers.level2.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 프린터Practice {
    public int solution(int[] priorities, int location) {
        int answer=0;
        int loc=location;

        Queue<Integer> que=new LinkedList<>();

        for(int i:priorities){
            que.add(i);
        }

        Arrays.sort(priorities);
        int size=priorities.length-1;

        while(!que.isEmpty()){
            Integer i=que.poll();
            if(i==priorities[size-answer]){//우선순위가 가장높은 것과 같으면
                answer++;
                loc--;
                if(loc<0)
                    break;
            }else{
                que.add(i);
                loc--;
                if(loc<0)
                    loc=que.size()-1;
            }

        }
        return answer;
    }
}
