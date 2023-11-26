import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RandomNumberGeneratorTest {
	@Test
	public void 리스트는_3개의_숫자를_반환한다() throws Exception{
		List<Integer> randomNumbers = RandomNumberGenerator.createRandomNumber();
		assertThat(randomNumbers.size()).isEqualTo(3);
	}

	@Test
	public void 숫자는_중복되지_않는다() throws Exception{
		List<Integer> randomNumbers = RandomNumberGenerator.createRandomNumber();
		Set<Integer> collect = randomNumbers.stream().collect(Collectors.toSet());
		assertThat(collect.size()).isEqualTo(3);
	}
}