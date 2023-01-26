package model;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CharacterList {
	private ArrayList<Character> allCharacters = new ArrayList<>(); 
	private ObservableList<Character> observableCharacters = FXCollections.observableList(allCharacters);
	
	public CharacterList() {
		
	}
	
	public ArrayList<Character> getAllCharacters() {
		return allCharacters;
	}

	public void setAllCharacters(ArrayList<Character> allCharacters) {
		this.allCharacters = allCharacters;
	}

	public ObservableList<Character> getObservableCharacters() {
		return observableCharacters;
	}

	public void setObservableCharacters(ObservableList<Character> observableCharacters) {
		this.observableCharacters = observableCharacters;
	}
	
	public void addCharacter(Character character) {
		allCharacters.add(character); 
	}


}
