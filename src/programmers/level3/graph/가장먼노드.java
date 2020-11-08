package programmers.level3.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 가장먼노드 {
    public int solution(int n, int[][] edge) {//노드의 개수, 간선에 대한 정보
        int answer = 0;

        //그래프 구현
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < edge.length; i++) {
            list.add(new ArrayList<Integer>());
        }

        //노드 연결
        int nodeA, nodeB;
        for (int[] node : edge) {
            nodeA = node[0];
            nodeB = node[1];
            list.get(nodeA).add(nodeB);
            list.get(nodeB).add(nodeA);
        }

        int[] count = new int[n + 1]; //1과의 거리
        boolean[] visited = new boolean[n + 1]; //방문 여부
        Queue<Integer> q = new LinkedList<>();
        q.add(1); //시작점
        visited[0] = visited[1] = true;//1에서 시작(0은 사용X)
        int now;
        while (!q.isEmpty()) {
            now = q.poll();
            for (int v : list.get(now)) { //현재 노드와 연결된 노드들
                if(visited[v]!=true) {
                    count[v] = count[now] + 1;//1과의 길이 저장
                    visited[v] = true;
                    q.add(v);
                }
            }
        }

        int max=0;//1과 가장 멀린 떨어진 노드 길이 저장
        for(int cnt:count){
            if(max<cnt){
                max=cnt;
                answer=1;
            }
            else if(max==cnt){
                answer++;
            }
        }

        return answer;
    }
}
