import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomNumberGenerator {
	public static List<Integer> createRandomNumber(){
		List<Integer> list = IntStream.range(1, 10).boxed().collect(Collectors.toList());
		Collections.shuffle(list);
		return list.stream().limit(3).collect(Collectors.toList());
	}
}
