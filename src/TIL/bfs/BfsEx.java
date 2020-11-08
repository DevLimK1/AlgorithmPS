package TIL.bfs;

import java.io.*;
import java.util.*;

public class BfsEx {
    static int V, E, S;
    static int x, y;
    static ArrayList<Integer>[] graph;

    static ArrayList<Integer> bfs;

    static boolean[] visit;

    static Queue<Integer> q;

    static BufferedReader br;
    static BufferedWriter bw;

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        graph = new ArrayList[E + 1];


        for (int i = 1; i <= E; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            st=new StringTokenizer(br.readLine());
            x=Integer.parseInt(st.nextToken());
            y=Integer.parseInt(st.nextToken());

            //방향성이 없는 그래프
            graph[x].add(y);
            graph[y].add(x);
        }

        //연결된 간선 정보를 정렬
        for(int i=1;i<=E;i++){
            Collections.sort(graph[i]);
        }

        bfs();
        for(int i=0;i<bfs.size();i++){
            System.out.print(bfs.get(i)+" ");
        }
    }

    private static void bfs() {
        bfs = new ArrayList<>();
        visit=new boolean[E+1];
        q = new LinkedList<>();

        //시작정점을 큐에 넣어줌
        q.add(S);
        visit[S]=true;

        //큐에 정점이 없어질 때까지 반복
        while(!q.isEmpty()){
            int qV=q.poll();
            bfs.add(qV);
            for(int val:graph[qV]){
                if(!visit[val]){
                    q.add(val);
                    visit[val]=true;
                }
            }
        }
    }
}
