package thisiscodingtest.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.youtube.com/watch?v=7C9RgOcvkvo 49분
//https://github.com/ndb796/python-for-coding-test/blob/master/5/10.java
public class 음료수얼려먹기 {
    public static int n,m;
    public static int[][] graph=new int[1001][1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
         n = Integer.parseInt(st.nextToken());
         m=Integer.parseInt(st.nextToken());


         //2차원 리스트의 맵 정보 입력
         for(int i=0;i<n;i++){
             String str = br.readLine();
             for(int j=0;j<m;j++){
                 graph[i][j]=str.charAt(j)-'0';
             }
         }

         //모든 노드 위치에 대하여 음료수 채우기
        int result=0;
         for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                 //dfs 수행
                 if(dfs(i,j)){
                     result++;
                 }
             }
         }

        System.out.println(result);




    }

    private static boolean dfs(int x, int y) {
        if(x<=-1||x>=n||y<=-1||y>=m){
            return false;
        }

        //아직 방문하지 않았다면
        if(graph[x][y]==0){
            //해당 노드 방문처리
            graph[x][y]=1;
            //상,하,좌,우의 위치들도 모두 재귀적으로 호출
            dfs(x-1,y);
            dfs(x,y-1);
            dfs(x+1,y);
            dfs(x,y+1);
            return true;
        }

        return false;
    }
}
