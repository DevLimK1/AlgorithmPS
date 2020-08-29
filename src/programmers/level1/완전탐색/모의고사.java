package programmers.level1.완전탐색;

import java.util.ArrayList;
import java.util.List;

/*문제 설명
https://programmers.co.kr/learn/courses/30/lessons/42840
수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한 조건
시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
입출력 예
answers	return
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3]
입출력 예 설명
입출력 예 #1

수포자 1은 모든 문제를 맞혔습니다.
수포자 2는 모든 문제를 틀렸습니다.
수포자 3은 모든 문제를 틀렸습니다.
따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.

입출력 예 #2

모든 사람이 2문제씩을 맞췄습니다.*/
public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] answer={};

        int[] stu1={1,2,3,4,5}; //1번 학생 찍는 방식
        int[] stu2={2,1,2,3,2,4,2,5};//2번 학생 찍는 방식
        int[] stu3={3,3,1,1,2,2,4,4,5,5}; //3번 학생 찍는 방식

        //맞힌 갯수
        int stu1Cnt=0;
        int stu2Cnt=0;
        int stu3Cnt=0;

        //맞힌 최대점
        int maxScore=0;
        int answersLength=answers.length;
        int stu1Length=stu1.length;
        int stu2Length=stu2.length;
        int stu3Length=stu3.length;

        for(int i=0;i<answersLength;i++){ //정답 카운트 세기
            if(stu1[i%stu1Length]==answers[i]){
                    stu1Cnt++;
            }

            if(stu2[i%stu2Length]==answers[i]){
                stu2Cnt++;
            }

            if(stu3[i%stu3Length]==answers[i]){
                stu3Cnt++;
            }
        }

        //최대 점수찾기
        maxScore=Math.max(Math.max(stu1Cnt,stu2Cnt),stu3Cnt);

        List<Integer> lst=new ArrayList<>();

        //최대점수와 같으면 list에 추가
        if(maxScore==stu1Cnt)
            lst.add(1);
        if(maxScore==stu2Cnt)
            lst.add(2);
        if(maxScore==stu3Cnt)
            lst.add(3);

        answer=new int[lst.size()];

        for(int i=0;i<lst.size();i++){
            answer[i]  =lst.get(i);
        }

        return answer;

    }
}
