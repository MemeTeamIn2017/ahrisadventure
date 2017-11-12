package memeteam.ahrisadventure.abilities;

import memeteam.ahrisadventure.Ability;
import memeteam.ahrisadventure.Player;

public class AbilityE implements Ability {
	
	private static final AbilityE instance = new AbilityE();
	
	public static AbilityE getInstance() {
		return instance;
	}
	
	private AbilityE (){
	
	}
	
	@Override
	public void use(Player player) {
	
	}
}
