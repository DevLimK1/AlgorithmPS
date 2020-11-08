package programmers.level3.이분탐색;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 징검다리Test {
    @Test
    public void 정답(){
        assertThat(new 징검다리().solution(25,new int[]{2,14,11,21,17},2),is(4));
    }
}