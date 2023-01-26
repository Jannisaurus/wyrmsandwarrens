package model;

// import java.util.HashMap;
import java.util.LinkedHashMap;

import javafx.collections.FXCollections;

public class Character {
	public String name; 
	private int level;
	private LinkedHashMap<String, Integer> stats = new LinkedHashMap<String, Integer>(); 
	
//	private ObservableLinkedMap<String,Integer> observableStats = FXCollections.observableLinkedHashMap(stats);
//
//	public ObservableMap<String,Integer> getStats(){
//	    return stats;
//	}
	
	// replace(key, value) - updates a single value
	// getOrDefault - if no value (?) is found it sends back a default - could in this case be set to 13?
	// computeIfPresent or just compute
	// merge - not obviously applicable
	
	public Character() {
	}
	
	public Character(String name, int level) {
		this.name = name;
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	} 
	
	public void addStats(String type, int stat) {
		stats.put(type, stat);
	}
	
	public void getStats () {
		for (Integer i : stats.values()) {
			System.out.println(i);
		}
	}
	
	public int getStat(String type) {
		return stats.get(type); 
	}
	
	public int calculateSave(String type) { 
		int save = (stats.get(type)) - 10;
		return save;	
	}
	
}
