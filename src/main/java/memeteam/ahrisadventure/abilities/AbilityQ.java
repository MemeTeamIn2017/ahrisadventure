package memeteam.ahrisadventure.abilities;

import memeteam.ahrisadventure.Ability;
import memeteam.ahrisadventure.Player;

public class AbilityQ implements Ability {
	
	private static final AbilityQ instance = new AbilityQ();
	
	private AbilityQ() {
	}
	
	public static AbilityQ getInstance(){
		return instance;
	}
	
	@Override
	public void use(Player player) {
		// TODO launch Ability projectile, w/e
	}
}
