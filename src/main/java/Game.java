import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {

	private Comparator comparator = new Comparator();
	private static final String ANSWER = "3스트라이크";
	public void start(){
		String result = "";
		List<Integer> computer = RandomNumberGenerator.createRandomNumber();

		while(!result.equals(ANSWER)) {
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자를 입력해 주세요 : ");
			List<Integer> user = toList(sc.nextLine());

			long correctCount = comparator.correctCount(computer, user);
			long strike = comparator.strikeCount(computer, user);
			result = ResultView.view(correctCount, strike);
			System.out.println(result);
		}

		ResultView.gameEndComment();
	}

	private List<Integer> toList(String number){
		List<Integer> user = new ArrayList<>();
		Arrays.stream(number.split(""))
			.forEach(i -> user.add(Integer.valueOf(i)));

		return user;
	}
}
