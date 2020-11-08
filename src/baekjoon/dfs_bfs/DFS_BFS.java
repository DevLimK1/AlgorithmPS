package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*https://www.acmicpc.net/problem/1260*/
public class DFS_BFS {

    public static int n,m,start;
    public static ArrayList<ArrayList<Integer>> adj=new ArrayList<>();//인접 리스트
    public static boolean[] d=new boolean[1001]; //정점

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stn=new StringTokenizer(br.readLine());

        int n=Integer.parseInt(stn.nextToken()); //정점 수
        int m=Integer.parseInt(stn.nextToken()); //간선 수
        int start=Integer.parseInt(stn.nextToken());//시작 정점

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<Integer>());
        }

        for(int i=0;i<m;i++){
            stn=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(stn.nextToken());
            int y=Integer.parseInt(stn.nextToken());
            adj.get(x).add(y);
            adj.get(y).add(x);
        }

        for(int i=1;i<=n;i++){
            Collections.sort(adj.get(i));
        }

        dfs(start);
        System.out.println();
        d=new boolean[1001];
        bfs(start);


    }

    private static void bfs(int start) {
        Queue<Integer> qu=new LinkedList<>();
        qu.offer(start);
        d[start]=true;
        while(!qu.isEmpty()){
            int now=qu.poll();
            System.out.println(now+" ");
            for(int i=0;i<adj.get(now).size();i++){
                int y=adj.get(now).get(i);
                if(!d[y]){
                    qu.offer(y);
                    d[y]=true;
                }
            }
        }
    }

    private static void dfs(int start) {
        if(d[start]) return;
        d[start]=true;
        System.out.print(start + " ");
        for(int i=0;i<adj.get(start).size();i++){
            int y=adj.get(start).get(i);
            dfs(y);
        }
    }
}
