package programmers.level2.stack;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

class 주식가격stack_verTest {
    @Test
    public void 정답(){
        assertThat(new 주식가격stack_ver().solution(new int[]{1,3,4,2,1}),is(new int[]{4,3,1,1,0}));
    }
}