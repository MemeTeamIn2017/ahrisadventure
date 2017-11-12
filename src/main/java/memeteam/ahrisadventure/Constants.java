package memeteam.ahrisadventure;

import memeteam.ahrisadventure.abilities.AbilityE;
import memeteam.ahrisadventure.abilities.AbilityQ;
import memeteam.ahrisadventure.abilities.AbilityR;
import memeteam.ahrisadventure.abilities.AbilityW;

import java.util.HashMap;
import java.util.Map;

public final class Constants {
	public static final Map<Ability, Integer> ABILITY_TIME_MAP = new HashMap<>();
	public static final Map<Action, Ability> ACTION_ABILITY_MAP = new HashMap<>();
	
	public static void init(){
		ABILITY_TIME_MAP.put(AbilityQ.getInstance(), 30);
		ABILITY_TIME_MAP.put(AbilityW.getInstance(), 30);
		ABILITY_TIME_MAP.put(AbilityE.getInstance(), 30);
		ABILITY_TIME_MAP.put(AbilityR.getInstance(), 30);
	
		ACTION_ABILITY_MAP.put(Action.CAST_ABILITY_Q,AbilityQ.getInstance());
		ACTION_ABILITY_MAP.put(Action.CAST_ABILITY_W,AbilityW.getInstance());
		ACTION_ABILITY_MAP.put(Action.CAST_ABILITY_E,AbilityE.getInstance());
		ACTION_ABILITY_MAP.put(Action.CAST_ABILITY_R,AbilityR.getInstance());
		
		
	}
	
	public static int getAbilityTime(Ability ability){
		return ABILITY_TIME_MAP.get(ability);
	}
	
}
