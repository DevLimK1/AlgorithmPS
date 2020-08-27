package programmers.level3.greedy;

import java.util.Arrays;
/*문제 설명
https://programmers.co.kr/learn/courses/30/lessons/42861?language=java
n개의 섬 사이에 다리를 건설하는 비용(costs)이 주어질 때, 최소의 비용으로 모든 섬이 서로 통행 가능하도록 만들 때 필요한 최소 비용을 return 하도록 solution을 완성하세요.

다리를 여러 번 건너더라도, 도달할 수만 있으면 통행 가능하다고 봅니다. 예를 들어 A 섬과 B 섬 사이에 다리가 있고, B 섬과 C 섬 사이에 다리가 있으면 A 섬과 C 섬은 서로 통행 가능합니다.

제한사항

섬의 개수 n은 1 이상 100 이하입니다.
costs의 길이는 ((n-1) * n) / 2이하입니다.
임의의 i에 대해, costs[i][0] 와 costs[i] [1]에는 다리가 연결되는 두 섬의 번호가 들어있고, costs[i] [2]에는 이 두 섬을 연결하는 다리를 건설할 때 드는 비용입니다.
같은 연결은 두 번 주어지지 않습니다. 또한 순서가 바뀌더라도 같은 연결로 봅니다. 즉 0과 1 사이를 연결하는 비용이 주어졌을 때, 1과 0의 비용이 주어지지 않습니다.
모든 섬 사이의 다리 건설 비용이 주어지지 않습니다. 이 경우, 두 섬 사이의 건설이 불가능한 것으로 봅니다.
연결할 수 없는 섬은 주어지지 않습니다.
입출력 예

n	costs	return
4	[[0,1,1],[0,2,2],[1,2,5],[1,3,1],[2,3,8]]	4
입출력 예 설명

costs를 그림으로 표현하면 다음과 같으며, 이때 초록색 경로로 연결하는 것이 가장 적은 비용으로 모두를 통행할 수 있도록 만드는 방법입니다.*/
public class 섬연결하기 {
    public int solution(int n, int[][] costs) {
        int answer = 0;

        Arrays.sort(costs,(o1, o2)->{ //비용 오름차순
            return o1[2]-o2[2];
        });

        // 부모노드를 기억한다.
        int[] parent = new int[n];

        // 초기 값 지정.
        for(int i=0; i<n; i++) {
            parent[i]=i;
        }

        for( int[] cost : costs ) {

            int from = cost[0];
            int to = cost[1];
            int value = cost[2];

            // 두 정점의 부모노드가 같다면, 이미 연결이 되었으므로 보지않는다.
            if( connectCheck(parent,from,to) ) continue;
            else {
                // 그렇지 않다면, 가중치를 늘려주고 부모노드를 update해준다.
                answer+=value;
                union(parent,from,to);
            }
        }
        return answer;
    }

    private static void union(int[] parent, int from, int to) {
        from = getParent(parent,from);
        to = getParent(parent,to);

        if( from < to ) parent[to] = from;
        else parent[from] = to;
    }

    private static boolean connectCheck(int[] parent, int from, int to) {

        from = getParent(parent,from);
        to = getParent(parent,to);

        return from==to;
    }

    private static int getParent(int[] parent, int edge) {
        if(parent[edge]==edge) return edge;
        return getParent(parent, parent[edge]);
    }
}
