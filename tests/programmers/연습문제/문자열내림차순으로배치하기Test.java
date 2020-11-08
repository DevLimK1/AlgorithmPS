package programmers.연습문제;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class 문자열내림차순으로배치하기Test {
    @Test
    public void 정답(){
        assertThat(new 문자열내림차순으로배치하기().solution("Zbcdefg"),is("gfedcbZ"));
    }
}