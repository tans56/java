package kr.co.ezenac.total;

public class PlayerTest {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		PlayerLevel aLevel = new AdvanceLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		PlayerLevel bLevel = new SuperLevel();
		player.upgradeLevel(bLevel);
		player.play(3);
	}
}
