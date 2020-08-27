package programmers.level2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class 스킬트리Test {
    @Test
    public void 정답(){
        스킬트리 m = new 스킬트리();
        assertThat(m.solution("CBD",new String[]{"BADE","CBADF","AECB","BDA"}), is(2));
    }
}