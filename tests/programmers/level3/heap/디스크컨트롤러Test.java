package programmers.level3.heap;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class 디스크컨트롤러Test {
    @Test
    public void 정답(){
        assertThat(new 디스크컨트롤러().solution(new int[][]{{0,3},{1,9},{2,6}}),is(9));
//        assertThat(new 디스크컨트롤러sol2().solution(new int[][]{{0,5},{6,1},{6,2}}),is(3));
//        assertThat(new 디스크컨트롤러sol2().solution(new int[][]{{0,5},{2,2},{4,2}}),is(3));
    }
}