package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AppTest {
    @Test
    void testSrabble1() throws Exception {
        boolean result = App.scrabble("rkqodlw", "woRld");
        assertThat(result).isTrue();
    }

    @Test
    void testSrabble2() throws Exception {
        boolean result = App.scrabble("begsdhhtsexoult", "Hexlet");
        assertThat(result).isTrue();
    }

    @Test
    void testSrabble3() throws Exception {
        boolean result = App.scrabble("thlxertwq", "hexlet");
        assertThat(result).isFalse();
    }

    @Test
    void testSrabble4() throws Exception {
        boolean result = App.scrabble("jvayu", "java");
        assertThat(result).isFalse();
    }

    @Test
    void testSrabble5() throws Exception {
        boolean result = App.scrabble("", "java");
        assertThat(result).isFalse();
    }
}
