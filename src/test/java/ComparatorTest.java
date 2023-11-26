import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ComparatorTest {

	private Comparator comparator;
	private List<Integer> computer;

	@BeforeEach
	void setUp() {
		comparator = new Comparator();
		computer = List.of(1, 2, 3);
	}

	@ParameterizedTest
	@CsvSource(value = {"1,2,3,3", "4,5,6,0", "1,2,5,2", "1,4,5,1", "3,2,1,3"})
	public void correctCountTest(int number1, int number2, int number3, int expected) throws Exception {
		List<Integer> user = List.of(number1, number2, number3);
		long actual = comparator.correctCount(computer, user);
		assertThat(actual).isEqualTo(expected);
	}

	@ParameterizedTest
	@CsvSource(value = {"1,2,3,3", "4,5,6,0", "1,2,5,2", "1,4,5,1", "3,1,2,0"})
	public void strikeCountTest(int number1, int number2, int number3, int expected) throws Exception {
		List<Integer> user = List.of(number1, number2, number3);
		long actual = comparator.strikeCount(computer, user);
		assertThat(actual).isEqualTo(expected);
	}
}