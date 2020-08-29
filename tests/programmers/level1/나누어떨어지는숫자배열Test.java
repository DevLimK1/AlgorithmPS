package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


class 나누어떨어지는숫자배열Test {
    @Test
    public void 정답(){
//        assertThat(new 나누어떨어지는숫자배열().solution(new int[]{5,9,7,10},5),is(new int[]{5,10}));
//        assertThat(new 나누어떨어지는숫자배열().solution(new int[]{2,36,1,3},1),is(new int[]{1,2,3,36}));
        assertThat(new 나누어떨어지는숫자배열().solution(new int[]{3,2,6},10),is(new int[]{-1}));
    }
}