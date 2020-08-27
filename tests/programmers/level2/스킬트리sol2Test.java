package programmers.level2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 스킬트리sol2Test {
    @Test
    public void 정답(){
        스킬트리sol2 m = new 스킬트리sol2();
        assertThat(m.solution("CBD",new String[]{"CDBDED","CBADF","AECB","BDA"}), is(2));
    }
}