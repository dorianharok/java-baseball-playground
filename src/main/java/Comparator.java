import java.util.List;
import java.util.stream.IntStream;

public class Comparator {
	public long correctCount(List<Integer> computer, List<Integer> user){
		return computer.stream()
			.filter(number -> user.contains(number))
			.count();
	}

	public long strikeCount(List<Integer> computer, List<Integer> user){
		return IntStream.range(0, 3)
			.filter(i -> computer.get(i).equals(user.get(i)))
			.count();
	}
}
