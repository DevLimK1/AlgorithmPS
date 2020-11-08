package TIL.MST;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Node implements Comparator<Node>{
    int s,e,v;

    public Node(int s, int e, int v) {
        this.s = s;
        this.e = e;
        this.v = v;
    }

    @Override
    public int compare(Node o1, Node o2) { //Min heap
        return o1.v-o2.v;
    }
}

public class Prim {
    static int N;
    static int E;
    static ArrayList<Node>[] nodeList;
    static boolean visit[];
    static int ans;
//    static ArrayList<Node> array = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ans=0;
        N=Integer.parseInt(br.readLine()); //정점 개수
        E=Integer.parseInt(br.readLine()); //간선 개수
        visit=new boolean[N+1];//방문 체크용 배열

        //각 노드의 연결상태를 저장
        nodeList = new ArrayList[N+1];

        for(int i=1;i<=N;i++){//각 배열 초기화
            nodeList[i] = new ArrayList<>();
        }

        String[]   tempStr;
        int start;
        int end;
        int value;

        for(int i=0;i<E;i++){
            tempStr=br.readLine().split(" ");
            start = Integer.parseInt(tempStr[0]);
            end = Integer.parseInt(tempStr[1]);
            value = Integer.parseInt(tempStr[2]);
            //양방향 간선
            nodeList[start].add(new Node(start,end,value));
            nodeList[end].add(new Node(start,end,value));
        }

        MST();
        System.out.println();
    }

    private static void MST() {
        PriorityQueue<Node> pq = new PriorityQueue<>();//Min heap

        Queue<Integer> q = new LinkedList<>();

        q.add(1); //시작점 1번 지정

        ArrayList<Node> tempList;
        Node tempNode;
        while(!q.isEmpty()){
            int currentNode = q.poll();
            visit[currentNode]=true;

            tempList=nodeList[currentNode];

            for(int i=0;i<tempList.size();i++){
                if(!visit[tempList.get(i).e]){
                    pq.add(tempList.get(i)); //현재 노드에 연결된 모든 간선을 우선순위 큐에 add
                }
            }

            while(!pq.isEmpty()){
                tempNode = pq.poll();

                if(!visit[tempNode.e]){
                    visit[tempNode.e]=true;
                    ans+=tempNode.v;
                    q.add(tempNode.e) ; //연결된 노드를 큐에 넣어줌
                    break;
                }
            }
        }
        System.out.println(ans);
    }

}
