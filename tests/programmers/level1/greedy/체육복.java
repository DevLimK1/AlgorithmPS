package programmers.level1.greedy;

public class 체육복 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] people = new int[n]; //-1:체육복 도난 0: 체육복 있음 1:체육복 여벌

        //도난 당한 lost 배열 비교 후, answer--
        for (int val : lost) {
            people[val - 1]--;
            answer--;
        }

        //여벌 옷 가져온 reserve 배열 비교
        for(int val:reserve){
            people[val-1]++;
            if(people[val-1]==0) //++했는데도 0이면 도난 당했던 사람이 체육복을 가지게 됨
                answer++;
        }

        int peopleLength=people.length;
        //도난 당한 사람이 있으면(-1의 요소값)
        //앞, 뒤에 있는 사람의 요소값과 비교하여 여벌 옷이 있으면(1의 값) 조건 처리
        for(int i=0;i<peopleLength;i++){
            if(people[i]==-1){
                if(i-1>=0&&people[i-1]==1){ //배열 인덱스가 0이상, 앞 번호 학생이 여벌 옷이 있으면
                    people[i-1]--;
                    people[i]++; //도난 당한 학생 체육수업 참가 가능
                    answer++;
                }else if(i+1<peopleLength&&people[i+1]==1){
                    people[i+1]--;
                    people[i]++;//도난당한 학생 체육수엄 참가 가능
                    answer++;
                }
            }
        }


        return answer;


    }
}
