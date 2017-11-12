package memeteam.ahrisadventure.rewards;

import memeteam.ahrisadventure.Player;
import memeteam.ahrisadventure.Reward;

public class Reward1UP implements Reward {
	
	
	@Override
	public void onPickUp(Player player) {
		player.setLives(player.getLives() + 1);
	}
	
	@Override
	public void onSpawn() {
	
	}
}
