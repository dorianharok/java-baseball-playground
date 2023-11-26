public class ResultView {

	public static String view(long correctCount, long strike){
		StringBuilder sb = new StringBuilder();

		long ball = correctCount - strike;

		if(ball != 0L){
			sb.append(String.format("%d볼 ", ball));
		}

		if(strike != 0L){
			sb.append(String.format("%d스트라이크", strike));
		}

		if(ball == 0L && strike == 0L){
			sb.append("낫싱");
		}

		return sb.toString().trim();
	}

	public static void gameEndComment(){
		StringBuilder sb = new StringBuilder();

		sb.append("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
		sb.append("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

		System.out.println(sb);
	}
}
