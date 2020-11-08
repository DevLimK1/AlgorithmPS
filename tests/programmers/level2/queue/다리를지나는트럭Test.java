package programmers.level2.queue;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class 다리를지나는트럭Test {
    @Test
    public void 정답(){
        assertThat(new 다리를지나는트럭().solution(2,10,new int[]{7,4,5,6}),is(8));
    }
}