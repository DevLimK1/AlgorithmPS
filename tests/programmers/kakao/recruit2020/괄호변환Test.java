package programmers.kakao.recruit2020;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class 괄호변환Test {
    @Test
    public void 정답(){
//        assertThat(new 괄호변환().solution("())))(((()"),is("()(())(())"));

        assertThat(new 괄호변환().solution("()))(()(()"),is("()(())(())"));
    }
}