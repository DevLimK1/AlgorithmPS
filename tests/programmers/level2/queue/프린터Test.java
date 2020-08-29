package programmers.level2.queue;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class 프린터Test {
    @Test
    public void 정답(){
//        assertThat(new 프린터().solution(new int[]{2,1,3,2},2),is(1));
        assertThat(new 프린터().solution(new int[]{1,1,9,1,1,1},0),is(5));
    }
}