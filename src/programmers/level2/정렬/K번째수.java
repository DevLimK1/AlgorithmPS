package programmers.level2.정렬;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int commandsLength = commands.length;

        for (int i = 0; i < commandsLength; i++) {
            int start = commands[i][0] - 1;//시작 인덱스
            int end = commands[i][1] - 1;//끝 인덱스
            int target = commands[i][2];//answer[]에 저장 될 target
            int count = 0;

            int[] temp = new int[array.length];//추출 한 원소들을 저장할 임시배열

            for(int j=start;j<=end;j++){
                temp[count++]=array[j];
            }

            for(int p=0;p<count-1;p++){
                for(int q=0;q<count-1-q;q++){
                    if(temp[q]>temp[q+1]){
                        int tmp=temp[q];
                        temp[q]=temp[q+1];
                        temp[q+1]=tmp;
                    }
                }
            }

            answer[i]=temp[target-1];


        }

        return answer;
    }
}
