package programmers.level2.완전탐색;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class 소수찾기_에라토스테네스의체_verTest {
    @Test
    public void 정답() {
//        assertThat(new 타겟넘버().solution(new int[]{1,1,1,1,1}, 3), is(5));
        assertThat(new 소수찾기_에라토스테네스의체_ver().solution("17"), is(3));
    }
}