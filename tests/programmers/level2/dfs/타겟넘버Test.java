package programmers.level2.dfs;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class 타겟넘버Test {

    @Test
    public void 정답() {
//        assertThat(new 타겟넘버().solution(new int[]{1,1,1,1,1}, 3), is(5));
        assertThat(new 타겟넘버().solution(new int[]{1,1,1}, 1), is(3));
    }
}