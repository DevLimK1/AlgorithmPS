package programmers.level3.dfs_bfs;

public class 네트워크_mine {
    public int solution(int n, int[][] computers) {//컴퓨터 개수 n
        int answer=0;
        boolean[] chk=new boolean[n];

        for(int i=0;i<n;i++){
            if(!chk[i]){
                dfs(computers,chk,i);
                answer++;
            }
        }
        return answer;
    }

    private void dfs(int[][] computers, boolean[] chk, int start) {
        chk[start]= true;
        for(int i=0;i<computers.length;i++){
            if(computers[start][i]==1&&!chk[i]){
                dfs(computers,chk,i);
            }
        }
    }
}
