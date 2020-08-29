package programmers.level2.정렬;

import java.util.Arrays;

public class K번째수sol2 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer=new int[commands.length];
        int commandsLength=commands.length;

        for(int i=0;i<commands.length;i++){
            int[] temp= Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
//            int[] copyOfArray=Arrays.copyOfRange(array,0,array.length); //새로운 배열 복제해서 복사함(주소값 다름)
//            copyOfArray[i]=10;
            Arrays.sort(temp);
            answer[i]=temp[commands[i][2]-1];
        }

        return answer;
    }
}
