package programmers.level3.dp;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class 정수삼각형Test {
    @Test
    public void 정답(){
        assertThat(new 정수삼각형().solution(new int[][]{{7},{3,8},{8,1,0},{2,7,4,4},{4,5,2,6,5}}),is(30));
    }
}