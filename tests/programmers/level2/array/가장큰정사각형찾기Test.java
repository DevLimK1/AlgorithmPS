package programmers.level2.array;

import org.junit.jupiter.api.Test;
import programmers.level2.dp.가장큰정사각형찾기;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class 가장큰정사각형찾기Test {
    @Test
    public void 정답(){
        assertThat(new 가장큰정사각형찾기().solution(new int[][]{{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}}),is(9));
    }
}