package programmers.level3.dp;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class 등굣길Test {
    @Test
    public void 정답(){
        assertThat(new 등굣길().solution(4,3,new int[][]{{2,2}}),is(4));
    }
}