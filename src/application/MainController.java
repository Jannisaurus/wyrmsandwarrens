package application;

import model.Character;
import model.Fighter;

public class MainController {
	public MainController () {
		Character character1 = new Character("Cleave", 1);
		
		character1.addStats("STR", 13);
		character1.addStats("DEX", 14);
		character1.addStats("CON", 15);
		
		character1.getStats();
		
		Fighter fighter1 = new Fighter("Bobby the bird", 9, "Bird"); 
		
		System.out.println(fighter1.getName());
		 
	}
	public void initialize () {
		
	}
	
}
