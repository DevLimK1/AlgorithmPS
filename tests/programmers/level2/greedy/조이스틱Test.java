package programmers.level2.greedy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.*;

class 조이스틱Test {
    @Test
    public void 정답(){
        assertThat(new 조이스틱().solution("JANZ"),is(56));
    }

}