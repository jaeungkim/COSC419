package Class_Examples.GameWithNoState;

public class GameContext {

	private Player player = new Player();

	public void gameAction(String state) {
		if (state == "healthy") {
			player.attack();
			player.fireBumb();
			player.fireGunblade();
			player.fireLaserPistol();
		} else if (state == "survival") {
			player.survive();
			player.firePistol();
			player.playdead();
		} else if (state == "dead") {
			player.dead();
		}
	}
}