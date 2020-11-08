package programmers.level2.hash;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class 위장Test {
    @Test
    public void 정답(){
        assertThat(new 위장().solution(new String[][]{{"yellow_hat","headgear"},{"blue_sunglasses","eyewear"},
                {"green_turban","headgear"}}),is(5));
//        assertThat(new 위장().solution(new String[][]{{"crow_mask","face"},{"blue_sunglasses","face"},
//                {"smoky_makeup","face"}}),is(3));
    }
}