package memeteam.ahrisadventure.abilities;

import memeteam.ahrisadventure.Ability;
import memeteam.ahrisadventure.Player;

public class AbilityR implements Ability {
	private static final AbilityR instance = new AbilityR();
	
	public static AbilityR getInstance() {
		return instance;
	}
	
	private AbilityR(){
	
	}
	@Override
	public void use (Player player){
	
	}
}
