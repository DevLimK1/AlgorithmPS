package programmers.월간코드챌린지시즌1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class 두개뽑아서더하기Test {
    @Test
    public void 정답(){
        assertThat(new 두개뽑아서더하기().solution(new int[]{2,1,3,4,1}),is(new int[]{2,3,4,5,6,7}));
    }
}