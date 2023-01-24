package model;

public class Fighter extends Character {
	private String role; 
	
	public Fighter (String name, int level, String role) {
		super (name, level);
		this.role = role; 
	}
	
}
