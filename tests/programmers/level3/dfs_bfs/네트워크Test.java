package programmers.level3.dfs_bfs;


import org.junit.jupiter.api.Test;
import programmers.level3.greedy.섬연결하기;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class 네트워크Test {
    @Test
    public void 정답(){
        네트워크_mine m=new 네트워크_mine();
        assertThat(m.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}), is(2));
//        assertThat(m.solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}), is(1));
    }

    @Test
    public void 섬연결하기(){
        섬연결하기 m =new 섬연결하기();
        assertThat(m.solution(4,new int[][]{{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}}),is(4));
    }
}