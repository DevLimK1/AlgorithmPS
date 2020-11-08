package programmers.월간코드챌린지시즌1;

import java.util.Set;
import java.util.TreeSet;

public class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int sum=0;
//        Set<Integer> resultSet=new HashSet<>();
        Set<Integer> resultSet=new TreeSet<>();
//        Set<Integer> resultTreeSet=new LinkedHashSet<>();

        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                sum=numbers[i]+numbers[j];
                resultSet.add(sum);
            }
        }

        answer=new int[resultSet.size()];
        int i=0;
        for (Integer num : resultSet) {
            answer[i++]=num;
        }

        return answer;
    }
}
