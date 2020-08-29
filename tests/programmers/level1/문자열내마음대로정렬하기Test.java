package programmers.level1;

import org.junit.jupiter.api.Test;
import programmers.level1.문자열.문자열내마음대로정렬하기sol2;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class 문자열내마음대로정렬하기Test {
    @Test
    public void 정답(){
        assertThat(new 문자열내마음대로정렬하기sol2().solution(new String[]{"sun","bed","car"},1),is(new String[]{"car","bed","sun"}));
    }
}