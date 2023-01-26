package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import model.Character;

import model.Fighter;

public class MainController {
	
	@FXML
	private TextArea testArea; 
	
	public MainController () {
		// Why have and use MainController to create data instead of initialize? 
		 
	}
	public void initialize () {
		Character character1 = new Character("Cleave", 1);
		
		character1.addStats("STR", 13);
		character1.addStats("DEX", 14);
		character1.addStats("CON", 15);
		
		character1.getStats();
		
		Fighter fighter1 = new Fighter("Bobby the bird", 9, "Bird"); 
		
		System.out.println(fighter1.getName());
		
		testArea.setText(fighter1.getName());
		
		
		
	}
	
}
