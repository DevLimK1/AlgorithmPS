package programmers.level2.정렬;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HIndexTest {
    @Test
    public void 정답(){
        assertThat(new HIndex().solution(new int[]{20,21}), is(2));
    }
}