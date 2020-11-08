package programmers.level3.dfs_bfs;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class 여행경로dfsTest {
    @Test
    public void 정답(){
//        assertThat(new 여행경로dfs().solution(new String[][]{{"ICN","JFK"},
//                {"HND","IAD"},{"JFK","HND"}}),is(new String[]{"ICN","JFK","HND","IAD"}));
        assertThat(new 여행경로dfs().solution(new String[][]{{"ICN","SFO"},
                {"ICN","ATL"},{"SFO","ATL"},{"ATL","ICN"},{"ATL","SFO"}}),is(new String[]{"ICN","JFK","HND","IAD"}));
    }
}