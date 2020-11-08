package programmers.연습문제;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class 일24나라의숫자Test {
    @Test
    public void 정답(){
        assertThat(new 일24나라의숫자().solution(6),is(14));
    }
}