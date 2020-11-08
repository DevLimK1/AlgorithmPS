package programmers.level3.dp;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class N으로표현Test {
    @Test
    public void 정답(){
//        assertThat(new N으로표현().solution(5,12),is(4));
        assertThat(new N으로표현().solution(2,11),is(3));
    }
}