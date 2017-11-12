package memeteam.ahrisadventure;

import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;

import java.util.ArrayList;
import java.util.List;

public class Level {
	private int id;
	private List<Object> objects;
	private List<Entity> entities;
	
	private Level(int id) {
		this.id = id;
		objects = new ArrayList<>();
		entities = new ArrayList<>();
	}
	
	public static Level loadLevel(String jsonString) throws JsonException {
		JsonReader reader = new JsonReader();
		JsonValue json = reader.parse(jsonString);
		
		if (json == null) {
			throw new JsonException(jsonString);
		}
		
		int id = json.getInt("id");
		
		Level level = new Level(id);
		
		return level;
	}
	
	public void spawnReward(Reward reward){
		// TODO
	}
	
	public void render (){
		entities.forEach(Entity::render);
		objects.forEach(Object::render);
	}
	
	
	public void tick (){
		
		
		
		entities.forEach(Entity::tick);
		
	}
	
	
	
	public boolean checkCollision (Collidable collidable){
		
		
		
		return false;
	}
	
	
}
