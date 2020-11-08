package naver2020new;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class test1Test {
    @Test
    public void 정답(){
//        assertThat(new test1().solution("kkaxbycyz","abc"),is("kkxyyz"));
        assertThat(new test1().solution("acbbcdc","abc"),is("cbdc"));
    }
}