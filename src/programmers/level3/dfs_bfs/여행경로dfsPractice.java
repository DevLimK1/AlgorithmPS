package programmers.level3.dfs_bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 여행경로dfsPractice {
     List<String> list=new ArrayList<>(); //여행 경로 한 싸이클씩 담을 list
    static boolean[] visited;
    static String route=""; //여행 경로 저장

    public String[] solution(String[][] tickets) {
        int ticketsLength=tickets.length;
        visited=new boolean[ticketsLength];

        for(int i=0;i<ticketsLength;i++){ //처음 시작은 ICN부터(출발이 ICN인게 여러개일 수 있음)
             Arrays.fill(visited,false); //visited false로 초기화
            String start=tickets[i][0],end=tickets[i][1];

            if(start.equals("ICN")){
                route=start+",";
                visited[i]=true;
                dfs(tickets,end,1,ticketsLength);
            }

        }

        Collections.sort(list);
        String[] answer=list.get(0).split(",");

        return answer;
    }

    private void dfs(String[][] tickets, String end, int cnt,int ticketsLength) {
        route+=end+",";

        if(ticketsLength==cnt){
            list.add(route);
            return;
        }

        //다음 경로 탐색
        for(int i=0;i<ticketsLength;i++){
            String andStart=tickets[i][0],andEnd=tickets[i][1];
            if(andStart.equals(end)&&!visited[i]){
                visited[i]=true;
                dfs(tickets,andEnd,cnt+1,ticketsLength);
                visited[i]=false;
                route=route.substring(0,route.length()-4);//마지막 경로를 지운다
            }
        }
        return;
    }
}
