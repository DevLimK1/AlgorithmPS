package programmers.level2.greedy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class 큰수만들기Test {
    @Test
    public void 정답(){
        큰수만들기stack_ver m =new 큰수만들기stack_ver();
        assertThat(m.solution("1924",2),is("94"));
        assertThat(m.solution("1231234",3),is("3234"));
        assertThat(m.solution("4177252841",4),is("775841"));
    }
}