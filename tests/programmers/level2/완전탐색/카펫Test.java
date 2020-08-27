package programmers.level2.완전탐색;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

class 카펫Test {
    @Test
    public void 정답(){
        assertThat(new 카펫().solution(10,2),is(new int[]{4,3}));
    }

}