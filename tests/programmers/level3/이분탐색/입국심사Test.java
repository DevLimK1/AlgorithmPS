package programmers.level3.이분탐색;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class 입국심사Test {
    @Test
    public void 정답(){
        assertThat(new 입국심사().solution(6,new int[]{7,10}),is(28));
    }
}