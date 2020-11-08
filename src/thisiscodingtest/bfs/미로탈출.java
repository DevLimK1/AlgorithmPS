package thisiscodingtest.bfs;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//https://www.youtube.com/watch?v=7C9RgOcvkvo 54분
//https://github.com/ndb796/python-for-coding-test/blob/master/5/11.java
class Node{
    private int index;
    private int distance;

    public Node(int index,int distance){
        this.index=index;
        this.distance=distance;
    }

    public int getIndex(){
        return this.index;
    }

    public int getDistance() {
        return distance;
    }
}

public class 미로탈출 {
    public static int n,m;
    public static int[][]graph =new int[201][201];

    //이동할 네 가지 방향 정의(상,하,좌,우)
    public static int dx[]={-1,1,0,0};
    public static int dy[]={0,0,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());

        for(int i=0;i<n;i++){
            String str = br.readLine();
            for(int j=0;j<m;j++){
                graph[i][j]=str.charAt(j)-'0';
            }
        }

        System.out.println(bfs(0,0));

    }


    private static int bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();

        q.offer(new Node(x,y));

        //큐가 빌 때까지 반복
        while(!q.isEmpty()){
            Node node=q.poll();

            x=node.getIndex();
            y=node.getDistance();
            //현재 위치에서 4가지 방향 확인
            for(int i=0;i<4;i++){
                int nx=x+dx[i];
                int ny=y+dy[i];
                //미로 찾기 공간을 벗어난 경우
                if(nx<0||nx>=n||ny<0||ny>=m)
                    continue;
                //벽인 경우 무시
                if(graph[nx][ny]==0)
                    continue;
                //해당 노드를 처음 방문하는 경우에만 최단 거리 기록
                if(graph[nx][ny]==1){
                    graph[nx][ny]=graph[x][y]+1;
                    q.offer(new Node(nx,ny));
                }
            }
        }

        //가장 오른쪽 아래까지의 최단 거리 반환
        return graph[n-1][m-1];

    }
}
