import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ResultViewTest {
	@ParameterizedTest
	@CsvSource(value = {"3,2,1볼 2스트라이크", "1,1,1스트라이크", "0,0,낫싱", "2,0,2볼", "3,3,3스트라이크"})
	public void strikeCountTest(int number1, int number2, String expected) throws Exception {
		String actual = ResultView.view(number1, number2);
		assertThat(actual).isEqualTo(expected);
	}
}