package programmers.level3.graph;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class 가장먼노드Test {
    @Test
    public void 정답(){
        assertThat(new 가장먼노드().solution(6,new int[][]{{3,6},{4,3},{3,2},{1,3},{1,2}
        ,{2,4},{5,2}}),is(3));
    }
}