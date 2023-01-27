package application;

import java.util.Map;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Character;
import model.CharacterList;
import model.Fighter;

public class MainController {
	
	@FXML
	private TextArea testArea; 
	
	@FXML
	private ListView testListView; 
	
	@FXML
	private TableColumn statsColumnValue;
	
	@FXML
	private TableColumn statsColumnKey;
	
	@FXML
	private TableView statsTableView;
	
	CharacterList characterList = new CharacterList(); 
	
	public MainController () {
		// Why have and use MainController to create data instead of initialize? 
		
		Character character1 = new Character("Cleave", 1);
		
		character1.addStats(18);
		character1.addStats(14);
		character1.addStats(16);
		character1.addStats(7);
		character1.addStats(10);
		character1.addStats(13);
		
		System.out.println(character1.getStats());
		
		Fighter fighter1 = new Fighter("Bobby the bird", 9, "Bird"); 
		
		System.out.println(fighter1.getName());
		
		testArea.setText(fighter1.getName());
		
		characterList.addCharacter(character1);
		characterList.addCharacter(fighter1);
		 
	}
	public void initialize () {
		
//		System.out.println(character1.calculateSave("STR"));
		
		System.out.println(characterList.getObservableCharacters());
		
		testListView.getItems().addAll(characterList.getObservableCharacters());
		
		updateStatsTableView();
		
	}
	
	public void updateStatsTableView() {
//		statsColumnValue.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getStats().values()));
//		statsColumnKey.setCellValueFactory(new MapValueFactory<>("firstName"));
//		
//		.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getStats().keySet()));
//	    
//	    statsTableView.setItems(characterList.getObservableCharacters());
	}
	
}
//	    Character selectedCharacter = characterList.getObservableCharacters().get(0);
	    
//	    Map<String, Integer> stats = selectedCharacter.getStats();
//	    // Create an ObservableList from the stats
//	    ObservableList<Map.Entry<String, Integer>> observableStats = FXCollections.observableArrayList(stats.entrySet());