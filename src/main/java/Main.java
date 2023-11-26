import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Game game = new Game();
		Scanner sc = new Scanner(System.in);

		int command = 0;
		while(command != 2){
			game.start();
			System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
			command = sc.nextInt();
		}
	}
}
