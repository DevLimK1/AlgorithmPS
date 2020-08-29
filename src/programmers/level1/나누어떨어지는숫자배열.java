package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> lst=new ArrayList<>();
        int arrLength=arr.length;
        int idx=0;

        for(int i=0;i<arrLength;i++){
            if(arr[i]%divisor==0){
                lst.add(arr[i]);
//                answer[idx++]=arr[i];
            }
        }

        if(lst.size()==0)
            return new int[]{-1};

        answer=new int[lst.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=lst.get(i);
        }



        Arrays.sort(answer);

        return answer;
    }
}
