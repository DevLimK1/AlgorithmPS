package TIL.dfs;

import java.util.Arrays;
import java.util.Scanner;

class DfsGraph {
    private int nV; //정점 개수
    private int[][] dfsGraph; //그래프
    private boolean[] visitArr; //정점 여부 확인

    public DfsGraph(int nV) {
        this.nV = nV;

        this.dfsGraph = new int[this.nV + 1][this.nV + 1];

        this.visitArr = new boolean[this.nV + 1];
    }

    public int[][] getGraph() {
        return this.dfsGraph;
    }

    //그래프 추가
    public void put(int x, int y) {
        //정점 x,y가 연결되었음을 의미
        this.dfsGraph[x][y] = this.dfsGraph[y][x] = 1;
    }

    //그래프 출력
    public void printGraphToAdjMatrix() {
        for (int i = 0; i < this.dfsGraph.length; i++) {
            for (int j = 0; j < this.dfsGraph[i].length; j++) {
                System.out.print(" "+this.dfsGraph[i][j]);
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

        //인접 행렬로 구현된 그래프에서
        //정점의 개수(nV) 만큼 탐색
        for(int i=1;i<=nV;i++){
            if(dfsGraph[vIdx][i]==1&&visitArr[i]!=true){
                dfs(i);
            }
        }
    }

}

public class MatrixDfs {
    public static void main(String[] args) {
        int nV = 0; //정점 개수
        int nE = 0; //간선 개수

        Scanner sc = new Scanner(System.in);
        nV = sc.nextInt();
        nE = sc.nextInt();

        DfsGraph dfsGraph=new DfsGraph(nV);

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

        dfsGraph.printGraphToAdjMatrix();

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
