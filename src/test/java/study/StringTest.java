package study;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split(){
        String[] arr = "1,2".split(",");
        assertThat(arr).contains("1", "2");
    }

    @Test
    void split2(){
        String[] arr = "1".split(",");
        assertThat(arr).containsExactly("1");
    }

    @Test
    void substring(){
        String str = "(1,2)";
        String actual = str.substring(1, str.length() - 1);
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt Exception 테스트")
    void exception(){
        String str = "abc";
        assertThatThrownBy(() ->
            str.charAt(3)
        ).isInstanceOf(IndexOutOfBoundsException.class)
            .hasMessageContaining("String index out of range: 3");
    }
}
