package programmers.level3.dfs_bfs;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class 단어변환Test {
    @Test
    public void 정답(){
        assertThat(new 단어변환().solution("hit","cog",
                new String[]{"hot","dot","dog","lot","log","cog"}),is(4));
    }
}