package baekjoon.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 숨바꼭질 {
    public static int MAX=100001;
    public static int subinLoc,sisterLoc;
    public static int[] data=new int[MAX];

    public static int bfs(){
        Queue<Integer> q=new LinkedList<>();
        q.offer(subinLoc);
        while(!q.isEmpty()){
            int now=q.poll();
            if (now == sisterLoc){
                return data[now];
            }
            int next=now-1;
            if(0<=next&&next<MAX&&data[next]==0){
                data[next]=data[now]+1;
                q.add(next);
            }
            next=now+1;
            if(0<=next&&next<MAX&&data[next]==0){
                data[next]=data[now]+1;
                q.add(next);
            }
            next=now*2;
            if(0<=next&&next<MAX&&data[next]==0){
                data[next]=data[now]+1;
                q.add(next);
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr=br.readLine().split(" ");

        subinLoc=Integer.parseInt(inputArr[0]);
        sisterLoc=Integer.parseInt(inputArr[1]);

        System.out.println(bfs());

    }
}
