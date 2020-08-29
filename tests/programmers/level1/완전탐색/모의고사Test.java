package programmers.level1.완전탐색;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class 모의고사Test {
    @Test
    public void 정답(){
        assertThat(new 모의고사().solution(new int[]{1,3,2,4,2}),is(new int[]{1,2,3}));
    }
}