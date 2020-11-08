package baekjoon.최단경로;


import java.io.*;
import java.util.*;

class Node implements Comparable<Node>{
    int end,weight;

    public Node(int end,int weight){
        this.end=end;
        this.weight=weight;
    }

    @Override
    public int compareTo(Node o) { //우선순위 큐에서 최소힙 정렬
        return weight-o.weight;
    }
}

public class 다익스트라 {
    private static final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int INF=100_000_000;
    static int v,e,k;
    static List<Node>[] list;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        StringTokenizer st=new StringTokenizer(br.readLine());

        v=Integer.parseInt(st.nextToken());
        e=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(br.readLine());
        list=new ArrayList[v+1];
        dist=new int[v+1];

        Arrays.fill(dist,INF);

        for(int i=1;i<=v;i++){
            list[i]=new ArrayList<>();
        }

        //리스트에 그래프 정보 초기화
        for(int i=0;i<e;i++){
            st=new StringTokenizer(br.readLine());
            int start=Integer.parseInt(st.nextToken());
            int end=Integer.parseInt(st.nextToken());
            int weight=Integer.parseInt(st.nextToken());
            //start에서 end로 가는 가중치
            list[start].add(new Node(end,weight));
        }

        StringBuilder sb=new StringBuilder();
        //다익스트라 알고리즘
        dijkstra(k);

        for(int i=1;i<=v;i++){
            if(dist[i]==INF)
                sb.append("INF\n");
            else
                sb.append(dist[i]+"\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

    private static void dijkstra(int start) {
        PriorityQueue<Node> q=new PriorityQueue<>();
        boolean[] check=new boolean[v+1];
        q.add(new Node(start,0 ));
        dist[start]=0;

        while(!q.isEmpty()){
            Node curNode=q.poll();
            int cur=curNode.end;

            if(check[cur]==true){
                continue;
            }

            check[cur]=true;

            for(Node node:list[cur]){
                if(dist[node.end]>dist[cur]+node.weight){ //목표하고 있는 정점까지 기존의 거리>현재까지의 거리+현재거리에서 목표 정점까지의 가중치
                    dist[node.end]=dist[cur]+node.weight;
                    q.add(new Node(node.end,dist[node.end])); //우선순위 큐에 의하여 최소힙
                }
            }
        }
    }
}
