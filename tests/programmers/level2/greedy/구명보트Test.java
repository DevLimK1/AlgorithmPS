package programmers.level2.greedy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

class 구명보트Test {
    @Test
    public void 정답(){
        assertThat(new 구명보트().solution(new int[]{70,50,80,50,30,40},100),is(3));
    }
}