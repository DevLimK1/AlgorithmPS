package programmers.연습문제;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 다음큰숫자Test {
    @Test
    public void 정답(){
        assertThat(new 다음큰숫자().solution(78),is(83));
    }
}