package memeteam.ahrisadventure;

import com.badlogic.gdx.math.Vector2;

public interface Entity extends Collidable{
	
	int getHealth();
	int getLives();
	
	int dealDamage(int amount);
	
	void setLives(int lives);
	void setHealth(int health);
	void enableAbility(Ability ability);
	
	Vector2 getPoisiton();
	Vector2 getVelocity();
	
	int getInvulnerabilityTime();
	int addInvulnerabilityTime(int amount);
	
	void render();
	void tick();
	
	// Controls
	void jump();
	void useAbility(Ability ability);
	void useBasicAttack();
	
	
}
