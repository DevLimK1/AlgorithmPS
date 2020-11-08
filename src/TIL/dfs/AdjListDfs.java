package TIL.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class AdjListGraph {
    private int nV;
    private ArrayList<ArrayList<Integer>> dfsGraph; //그래프
    private boolean[] visitArr;

    public AdjListGraph(int nV) {
        this.nV = nV;
        this.dfsGraph=new ArrayList<>();

        for(int i=0;i<nV+1;i++){
            dfsGraph.add(new ArrayList<Integer>());
        }

        visitArr = new boolean[nV+1];
    }

    //그래프 return
    public ArrayList<ArrayList<Integer>> getGraph(){
        return dfsGraph;
    }

    public ArrayList<Integer> getNode(int i){
        return dfsGraph.get(i);
    }


    //그래프 양방향
    public void put(int x,int y){
        dfsGraph.get(x).add(y);
        dfsGraph.get(y).add(x);
    }

    //그래프 단방향
    public void putSingle(int x,int y){
        dfsGraph.get(x).add(y);
    }

    public void printGraphToAdjList(){
        for(int i=1;i<dfsGraph.size();i++){
            System.out.print("정점"+i+"의 인접리스트");

            for(int j=0;j<dfsGraph.get(i).size();j++){
                System.out.print("->"+dfsGraph.get(i).get(j));
            }
            System.out.println();
        }
    }

    //정점 방문 여부 확인 배열 초기화
    public void clearVisitArr(){
        Arrays.fill(visitArr,false);
    }

    public void dfs(int vIdx){
        visitArr[vIdx]=true;
        System.out.print(vIdx+" ");

        for(int i : dfsGraph.get(vIdx)){
            if(visitArr[i]!=true){
                dfs(i);
            }
        }

    }
}

public class AdjListDfs {
    public static void main(String[] args) {
        int nV = 0;    // 정점의 개수
        int nE = 0;    // 간선의 개수

        Scanner sc = new Scanner(System.in);
        nV = sc.nextInt();    // 정점
        nE = sc.nextInt();    // 간선

        // 입력받은 정점의 개수로 그래프 초기화
        AdjListGraph dfsGraph = new AdjListGraph(nV);
        // 그래프에 정점과 간선 입력
        // 입력받은 간선의 개수만큼 반복
        // ex) 정점 8, 간선 10
        dfsGraph.put(1, 2);
        dfsGraph.put(1, 3);
        dfsGraph.put(2, 4);
        dfsGraph.put(2, 5);
        dfsGraph.put(3, 6);
        dfsGraph.put(3, 7);
        dfsGraph.put(4, 8);
        dfsGraph.put(5, 8);
        dfsGraph.put(6, 8);
        dfsGraph.put(7, 8);

        sc.close();

        // 입력한 정점과 간선으로 구성된 인접리스트 출력
        dfsGraph.printGraphToAdjList();

        // 정점 순서대로 그래프 탐색
        System.out.println();
        System.out.print("정점 1부터 탐색 : ");
        dfsGraph.dfs(1);

        System.out.println();
        System.out.print("정점 2부터 탐색 : ");
        dfsGraph.clearVisitArr();
        dfsGraph.dfs(2);

        System.out.println();
        System.out.print("정점 3부터 탐색 : ");
        dfsGraph.clearVisitArr();
        dfsGraph.dfs(3);

        System.out.println();
        System.out.print("정점 4부터 탐색 : ");
        dfsGraph.clearVisitArr();
        dfsGraph.dfs(4);

        System.out.println();
        System.out.print("정점 5부터 탐색 : ");
        dfsGraph.clearVisitArr();
        dfsGraph.dfs(5);

        System.out.println();
        System.out.print("정점 6부터 탐색 : ");
        dfsGraph.clearVisitArr();
        dfsGraph.dfs(6);

        System.out.println();
        System.out.print("정점 7부터 탐색 : ");
        dfsGraph.clearVisitArr();
        dfsGraph.dfs(7);

        System.out.println();
        System.out.print("정점 8부터 탐색 : ");
        dfsGraph.clearVisitArr();
        dfsGraph.dfs(8);



    }
}
