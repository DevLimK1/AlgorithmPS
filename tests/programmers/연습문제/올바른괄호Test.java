package programmers.연습문제;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class 올바른괄호Test {
    @Test
    public void 정답(){
        assertThat(new 올바른괄호().solution("(())()"),is(true));
    }
}