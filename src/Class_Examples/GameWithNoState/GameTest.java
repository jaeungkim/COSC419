package Class_Examples.GameWithNoState;

public class GameTest {

	
		public static void main(String[] args) {

			GameContext context = new GameContext();

			context.gameAction("healthy");
			System.out.println("*****");


			context.gameAction("survival");
			System.out.println("*****");


			context.gameAction("dead");
			System.out.println("*****");

		}
}