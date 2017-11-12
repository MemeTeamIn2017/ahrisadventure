package memeteam.ahrisadventure;

public class Screen {
	private Level level;
	
	
	public Screen() {
		try {
			level = Level.loadLevel("data/level1.json");
		} catch (JsonException e) {
			e.printStackTrace();
			System.exit(1);
		}

		
	}
	
	
}
