package programmers.연습문제;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class 땅따먹기Test {
    @Test
    public void 정답(){
        assertThat(new 땅따먹기().solution(new int[][]{{1,2,3,5},{5,6,7,8},{4,3,2,1}}),is(16));
    }
}