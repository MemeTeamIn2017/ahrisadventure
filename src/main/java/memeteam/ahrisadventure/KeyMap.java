package memeteam.ahrisadventure;

import java.util.HashMap;
import java.util.Map;

public class KeyMap {
	private Map<Integer, Action> keyMap = new HashMap<>();
	private static final KeyMap instance = new KeyMap();
	
	public static KeyMap getInstance() {
		return instance;
	}
	
	private KeyMap() {
	}
	
	public Action getMapping(int key) {
		return keyMap.get(key);
	}
	
	public void mapKey(int key, Action action) {
		keyMap.remove(key);
		
		int keyToRemove = -1;
		
		if (keyMap.containsValue(action)) {
			for (Map.Entry<Integer, Action> entry : keyMap.entrySet()) {
				if (entry.getValue() == action) {
					keyToRemove = entry.getKey();
					break;
				}
			}
			
			keyMap.remove(keyToRemove);
		}
		
		keyMap.put(key, action);
	}
}
