package programmers.level2.hash;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 전화번호목록Test {
    @Test
    public void 정답(){
        assertThat(new 전화번호목록arr_ver().solution(new String[]{"97674223","1195524421","119"}),is(false));
        assertThat(new 전화번호목록arr_ver().solution(new String[]{"123","456","789"}),is(true));
        assertThat(new 전화번호목록arr_ver().solution(new String[]{"12","123","1235","567","88"}),is(false));
    }

}