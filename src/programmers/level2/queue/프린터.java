package programmers.level2.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 프린터 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<Integer>();

        for(int i : priorities){
            que.add(i);
        }

        Arrays.sort(priorities); //queue 오름차순으로 정렬
        int size = priorities.length-1; //priorities index에 접근하기 위한 size

        while(!que.isEmpty()){
            Integer i = que.poll();
            if(i == priorities[size - answer]){ //우선순위가 높은 순서대로 queue에서 추출
                answer++;
                l--;
                if(l <0)
                    break;
            }else{ //뒤에 우선순위가 높은 것이 있으므로 queue 맨 뒤로 add
                que.add(i);
                l--;
                if(l<0)
                    l=que.size()-1;
            }
        }

        return answer;
    }
}
