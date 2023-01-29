package application;

import java.util.Collections;
import java.util.Map;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Character;
import model.CharacterList;
import model.Fighter;

public class MainController {
	
	@FXML
	private TextArea testArea; 
	
	@FXML
	private ListView<Character> testListView; 
	
	@FXML
	private TableColumn<Character, Integer> statsColumnValue;
	
	@FXML
	private TableColumn<Character, String> statsColumnKey;
	
	@FXML
	private TableView<Character> statsTableView;
	
	@FXML
	private TextField textFieldStr; 
	
	@FXML
	private TextField textFieldDex; 
	
	@FXML
	private TextField textFieldCon; 
	
	@FXML
	private TextField textFieldInt; 
	
	@FXML
	private TextField textFieldWis; 
	
	@FXML
	private TextField textFieldCha; 
	
	CharacterList characterList = new CharacterList(); 
	
	public MainController () {
		// Why have and use MainController to create data instead of initialize? 
		
		System.out.println(characterList.getObservableCharacters());
	
		
		Character character1 = new Character("Cleave", 1);
		
		character1.addStats(18);
		character1.addStats(14);
		character1.addStats(16);
		character1.addStats(7);
		character1.addStats(10);
		character1.addStats(13);
		
		System.out.println(character1.getStats());
		
		Fighter fighter1 = new Fighter("Bobby the bird", 9, "Bird"); 
		
		fighter1.addStats(15);
		fighter1.addStats(10);
		fighter1.addStats(11);
		fighter1.addStats(17);
		fighter1.addStats(9);
		fighter1.addStats(8);
		
		System.out.println(fighter1.getName());
		
		System.out.println(fighter1.getStats());
		
		characterList.addCharacter(character1);
		characterList.addCharacter(fighter1);
		 
	}
	public void initialize () {
		
		testListView.getItems().addAll(characterList.getObservableCharacters());
	
		updateStatsTableView();
		
		testArea.setText(characterList.getAllCharacters().get(0).getName());
		
	}
	
	public void updateStatsTableView() {
		statsColumnValue.setCellValueFactory(new PropertyValueFactory<Character, Integer>("level"));
		statsColumnKey.setCellValueFactory(new PropertyValueFactory<Character, String>("name"));		
	    
	    statsTableView.setItems(characterList.getObservableCharacters());
	}
	
}


//ObservableList<Character> emptyList = FXCollections.observableList(Collections.emptyList());
//statsColumnKey.setCellValueFactory(new MapValueFactory<>("firstName"));
//
//.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getStats().keySet()));

//	    Character selectedCharacter = characterList.getObservableCharacters().get(0);
	    
//	    Map<String, Integer> stats = selectedCharacter.getStats();
//	    // Create an ObservableList from the stats
//	    ObservableList<Map.Entry<String, Integer>> observableStats = FXCollections.observableArrayList(stats.entrySet());