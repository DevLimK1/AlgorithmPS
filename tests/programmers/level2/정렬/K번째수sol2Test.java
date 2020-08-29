package programmers.level2.정렬;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class K번째수sol2Test {
    @Test
    public void 정답(){
        assertThat(new K번째수sol2().solution(new int[]{1,5,2,6,3,7,4},new int[][]{{2,5,3},{4,4,1},{1,7,3}}),is(new int[]{5,6,3}));
    }
}