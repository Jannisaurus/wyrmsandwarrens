package model;

import java.util.Collection;
// import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;

public class Character {
	public String name; 
	private int level;
//	private LinkedHashMap<String, Integer> stats = new LinkedHashMap<String, Integer>(); 
	
//	private ObservableMap<String,Integer> observableStats = FXCollections.observableHashMap(new LinkedHashMap<>());
	
	private ObservableMap<String,Integer> stats = FXCollections.observableMap(new LinkedHashMap<>());

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
	
//    public Integer getStatsValue(String key) {
//        return stats.get(key);
//    }

    public String getStatsKey(Integer value) {
        for (Map.Entry<String, Integer> entry : stats.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
    
    public Collection<Integer> getStatsValue() {
        return stats.values();
    }

    public Set<String> getStatsKey() {
        return stats.keySet();
    }
	
}
