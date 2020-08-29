package programmers.level1.hash;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class 완주하지못한선수Test {
    @Test
    public void 정답(){
//        String[] participant ={"leo","kiki","eden"};
        String[] participant ={"mislav","stanko","mislav","ana"};

//        String[] completion={"eden","kiki"};
        String[] completion={"stanko","ana","mislav"};

//        String answer="leo";
        String answer="mislav";

        assertThat(new 완주하지못한선수().solution(participant,completion),is(answer));
    }
}