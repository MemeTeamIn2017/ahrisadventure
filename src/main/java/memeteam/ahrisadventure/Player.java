package memeteam.ahrisadventure;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.collision.BoundingBox;
import memeteam.ahrisadventure.abilities.AbilityQ;
import memeteam.ahrisadventure.abilities.AbilityW;
import memeteam.ahrisadventure.abilities.AbilityE;
import memeteam.ahrisadventure.abilities.AbilityR;

import java.util.ArrayList;
import java.util.List;

public class Player implements Entity {
	
	private int lives;
	private int health;
	private List<AbilityStack> abilityStackList = new ArrayList<>();
	
	@Override
	public int getHealth() {
		return 0;
	}
	
	@Override
	public int getLives() {
		return 0;
	}
	
	@Override
	public int dealDamage(int amount) {
		return 0;
	}
	
	@Override
	public void setLives(int lives) {
		this.lives = lives;
	}
	
	@Override
	public void setHealth(int health) {
		this.health = health;
	}
	
	@Override
	public void enableAbility(Ability ability) {
	
	}
	
	@Override
	public Vector2 getPoisiton() {
		return null;
	}
	
	@Override
	public Vector2 getVelocity() {
		return null;
	}
	
	@Override
	public int getInvulnerabilityTime() {
		return 0;
	}
	
	@Override
	public int addInvulnerabilityTime(int amount) {
		return 0;
	}
	
	@Override
	public void render() {
	
	}
	
	@Override
	public void tick() {
	
	}
	
	@Override
	public void jump() {
	
	}
	
	@Override
	public void useAbility(Ability ability) {
	
	}
	
	@Override
	public void useBasicAttack() {
	
	}
	
	public void onKeyPress (int key){
		KeyMap keyMap = KeyMap.getInstance();
		Action action = keyMap.getMapping(key);
		
		if (action == null){
			return;
		}
		
		switch (action)
		{
			
			case CAST_ABILITY_Q:
				abilityStackList.forEach(abilityStack -> {
					if (abilityStack.getAbility() == AbilityQ.getInstance()){
						abilityStack.use(this);
					}
				});
				break;
			case CAST_ABILITY_W:
				abilityStackList.forEach(abilityStack -> {
					if (abilityStack.getAbility() == AbilityW.getInstance()){
						abilityStack.use(this);
					}
				});
				break;
			case CAST_ABILITY_E:
				abilityStackList.forEach(abilityStack -> {
					if (abilityStack.getAbility() == AbilityE.getInstance()){
						abilityStack.use(this);
					}
				});
				break;
			case CAST_ABILITY_R:
				abilityStackList.forEach(abilityStack -> {
					if (abilityStack.getAbility() == AbilityR.getInstance()){
						abilityStack.use(this);
					}
				});
				break;
			case OPEN_MENU:
				break;
			case JUMP:
				break;
			case MOVE_LEFT:
				break;
			case MOVE_RIGHT:
				break;
			case MOVE_UP:
				break;
			case MOVE_DOWN:
				break;
		}
	}
	
	@Override
	public BoundingBox getBoundingBox() {
		return null;
	}
}
