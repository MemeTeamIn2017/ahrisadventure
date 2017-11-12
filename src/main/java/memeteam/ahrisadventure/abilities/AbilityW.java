package memeteam.ahrisadventure.abilities;

import memeteam.ahrisadventure.Ability;
import memeteam.ahrisadventure.Player;

public class AbilityW implements Ability {
	
	@Override
	public void use(Player player) {
	
	}
	
	private static final AbilityW instance = new AbilityW();
	
	public static AbilityW getInstance() {
		return instance;
	}
	
	private AbilityW () {
	
	}
}
