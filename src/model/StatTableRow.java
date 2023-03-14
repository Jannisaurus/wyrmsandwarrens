package model;

public class StatTableRow {
	String statName; 
	int statScore; 
	int mod; 
	int save;

	public StatTableRow (String statName) {
		this.statName = statName; 
	}

	public String getStatName() {
		return statName;
	}

	public void setStatName(String statName) {
		this.statName = statName;
	}

	public int getStatScore() {
		return statScore;
	}

	public void setStatScore(int statScore) {
		this.statScore = statScore;
		this.mod = calculateMod(statScore);
		this.save = statScore - 10;
	}

	public int getMod() {
		return mod;
	}

	public void setMod(int mod) {
		this.mod = mod;
	}

	public int getSave() {
		return save;
	}

	public void setSave(int save) {
		this.save = save;
	}
	
	public int calculateMod(int stat) {
		if (stat >= 20) {
			return 4; 
		} else if (stat >= 18) {
			return 3; 
		} else if (stat >= 16) {
			return 2; 
		} else if (stat >= 13) {
			return 1;
		} else if (stat >= 8) {
			return 0; 
		} else {
			return -1; 
		}
	}

	
	
}
