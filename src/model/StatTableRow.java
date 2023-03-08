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

	
	
}
