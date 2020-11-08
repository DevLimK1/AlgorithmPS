package programmers.level3.heap;

import org.junit.jupiter.api.Test;
import programmers.level3.hash.베스트앨범sol2;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class 베스트앨범Test {
    @Test
    public void 정답(){
        assertThat(new 베스트앨범sol2().solution(new String[]{"classic","pop","classic","classic","pop"},
                new int[]{500,600,150,800,2500}),is(new int[]{4,1,3,0}));
    }
}