package programmers.level3.graph;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class 순위Test {
    @Test
    public void 정답(){
        Assert.assertThat(new 순위().solution(5,new int[][]{{4,3},{4,2},{3,2},{1,2},{2,5}}), Is.is(2));
    }
}