package memeteam.ahrisadventure;

import com.badlogic.gdx.math.Vector2;

public abstract class Object {
	
	protected Vector2 position;
	
	public abstract void destroy();
	
	public boolean isDestroyable() {
		return false;
	}
	
	public abstract void render ();
	
}
