package baekjoon.dfs;

import java.util.Scanner;

public class 유기농배추 {
    public static int t,m,n,k;
    public static int[][] data=new int[50][50];
    public static boolean[][] visited=new boolean[50][50];
    public static int[] dx={-1,1,0,0};//상하
    public static int[] dy={0,0,-1,1};//좌우



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        t=sc.nextInt();

        while(t-->0){
            m = sc.nextInt();
            n = sc.nextInt();
            k = sc.nextInt();

            for(int i=0;i<k;i++){ //심어진 배추 표시
                int y=sc.nextInt();
                int x = sc.nextInt();
                data[x][y]=1;
            }

            int result=0;
            for(int i=0;i<n;i++){ //세로
                for(int j=0;j<m;j++){ //가로
                    if(data[i][j]>0&&!visited[i][j]){
                        dfs(i,j);
                        result++;
                    }
                }
            }
            System.out.println(result);
        }
    }


    //DFS
    private static void dfs(int x, int y) {
        visited[x][y]=true;
        for(int i=0;i<4;i++){
            int nx=x+dx[i];//상하
            int ny=y+dy[i];//좌우
            if(nx<0||nx>=n||ny<0||ny>=m){//범위를 넘어서면
                continue;
            }
            if(data[nx][ny]>0&&!visited[nx][ny]){
                dfs(nx,ny);
            }
        }
    }
}
