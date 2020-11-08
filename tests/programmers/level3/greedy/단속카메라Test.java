package programmers.level3.greedy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class 단속카메라Test {
    @Test
    public void 정답(){
        assertThat(new 단속카메라().solution(new int[][]{{-20,15},{-14,-5},{-18,-13},{-5,-3}}),is(2));
    }
}