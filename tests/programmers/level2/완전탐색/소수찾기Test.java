package programmers.level2.완전탐색;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class 소수찾기Test {
    @Test
    public void 정답(){
        assertThat(new 소수찾기().solution("17"),is(3));
//        assertThat(new 소수찾기연습().solution("011"),is(2));
    }
}