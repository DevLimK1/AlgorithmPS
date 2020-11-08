package programmers.level3.graph;

import java.util.Arrays;

//플로이드 와샬 알고리즘 사용
public class 순위 {
    private static int INF=987654321;
    public int solution(int n, int[][] results) {
        int answer = 0;
        int[][] scores=new int[n+1][n+1];
        int win,lose;

        //배열 초기화
        for(int[] score:scores){
            Arrays.fill(score,INF);
        }

        //대각선을 0
        for(int i=0;i<scores.length;i++){
            for(int j=0;j<scores[i].length;j++){
                if(i==j)
                    scores[i][j]=0;
            }
        }

        //한방향 그래프 win->lose
        for(int[] result:results){
            win=result[0];
            lose=result[1];
            scores[win][lose]=1;
        }

        //scores[i][j]로 가는 최단경로 저장
        for(int k=1;k<=n;k++){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(scores[i][j]>scores[i][k]+scores[k][j])
                        scores[i][j]=scores[i][k]+scores[k][j];
                }
            }
        }

        //선수들이 게임을 한 적이 있는지 확인
        boolean[] flag=new boolean[n+1];
        Arrays.fill(flag,true);
        for(int i=1;i<=n;i++){//i라는 사람이
            for(int j=1;j<=n;j++){//j라는 선수와 게임한적 있는지 체크
                if(i==j)
                    continue;
                if(scores[i][j]==INF&&scores[j][i]==INF) {//i,j가 게임하지 않았다면
                    flag[i] = false;
                    break; //모두와 게임을 해야하므로
                }
            }
        }

        for(int i=1;i<flag.length;i++){
            if(flag[i])
                answer++;
        }

        return answer;
    }
}
