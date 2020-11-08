package programmers.level3.dfs_bfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 여행경로dfs {
    List<String> list = new ArrayList<>();
    static String route = "";
    static boolean[] visit; //방문체크

    public String[] solution(String[][] tickets) {
        int ticketsLength = tickets.length;

        for (int i = 0; i < ticketsLength; i++) {
            visit = new boolean[ticketsLength];
            String start = tickets[i][0], end = tickets[i][1];

            if (start.equals("ICN")) {
                route = start + ",";
                visit[i]=true;
                dfs(tickets,end,1);
            }
        }

        Collections.sort(list);
        String[] answer=list.get(0).split(",");

        return answer;

    }

    private void dfs(String[][] tickets, String end, int cnt) {
        route+=end+",";

        if(cnt==tickets.length){
            list.add(route);
            return;
        }

        //다음 경로 탐색
        for(int i=0;i<tickets.length;i++){
            String s=tickets[i][0],e=tickets[i][1];
            if(s.equals(end)&&!visit[i]){
                visit[i]=true;
                dfs(tickets,e,cnt+1);
                visit[i]=false;
                route=route.substring(0,route.length()-4); //마지막 경로를 지운다
            }
        }

    }
}
