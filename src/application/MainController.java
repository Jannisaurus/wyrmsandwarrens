package application;

import java.util.Collections;
import java.util.Map;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import model.Character;
import model.CharacterList;
import model.Fighter;
import model.StatTableRow;

public class MainController {
	
	@FXML
	private TextArea testArea; 
	
	@FXML
	private ListView<Character> testListView; 
	
	@FXML
	private TableColumn<Character, Integer> levelTableColumn;
	
	@FXML
	private TableColumn<Character, String> characterTableColumn;
	
	@FXML
	private TableView<Character> characterTableView;
	
	@FXML
	private TableColumn<StatTableRow, String> statsTableColumn;
	
	@FXML
	private TableColumn<StatTableRow, Integer> scoreTableColumn;
	
	@FXML
	private TableColumn<StatTableRow, Integer> modTableColumn;
	
	@FXML
	private TableColumn<StatTableRow, Integer> saveTableColumn;
	
	@FXML
	private TableView<StatTableRow> statsTableView;
	
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
	
	@FXML
	private Label modLabelStr; 
	
	@FXML
	private Label modLabelDex;
	
	@FXML
	private Label modLabelCon;
	
	@FXML
	private Label modLabelInt;
	
	@FXML
	private Label modLabelWis;
	
	@FXML
	private Label modLabelCha;
	
//	@FXML
//	private Button buttonGenerateCharacter;
	
	@FXML
	private TextField textFieldName;
	
	private CharacterList characterList = new CharacterList(); 
	private ObservableList<StatTableRow> statRow = FXCollections.observableArrayList();
	
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
		
		statRow.add(new StatTableRow("Str"));
		statRow.add(new StatTableRow("Dex"));
		statRow.add(new StatTableRow("Con"));
		statRow.add(new StatTableRow("Int"));
		statRow.add(new StatTableRow("Wis"));
		statRow.add(new StatTableRow("Cha"));
		
//		testListView.getItems().addAll(fighter1.getStats());
		 
	}
	public void initialize () {
		
		testListView.getItems().addAll(characterList.getObservableCharacters());
		
		updateStatsTableView();
	
		updateCharacterTableView();
		
		testArea.setText(characterList.getAllCharacters().get(0).getName());
		
	}
	
	public void updateCharacterTableView() {
		levelTableColumn.setCellValueFactory(new PropertyValueFactory<Character, Integer>("level"));
		characterTableColumn.setCellValueFactory(new PropertyValueFactory<Character, String>("name"));
	    
	    characterTableView.setItems(characterList.getObservableCharacters());
	}
	
	public void updateStatsTableView() {
		statsTableColumn.setCellValueFactory(new PropertyValueFactory<StatTableRow, String>("statName"));
		scoreTableColumn.setCellValueFactory(new PropertyValueFactory<StatTableRow, Integer>("statScore"));		
		modTableColumn.setCellValueFactory(new PropertyValueFactory<StatTableRow, Integer>("mod"));
		saveTableColumn.setCellValueFactory(new PropertyValueFactory<StatTableRow, Integer>("save"));
		
	    statsTableView.setItems(statRow);
	}
	public void buttonGenerateCharacter(ActionEvent event) {
		
		String name = textFieldName.getText();
		
		System.out.println(name);
		
		Character character = new Character(name); 
		
		System.out.println(character.getLevel());
		
		characterList.addCharacter(character);
		
		System.out.println(characterList.getAllCharacters().size());
		
		updateCharacterTableView();
	}
	
	
	public void characterClicked(MouseEvent event) {
		Character clickedCharacter = characterTableView.getSelectionModel().getSelectedItem();
		
		if (clickedCharacter != null) {
			
			for(int i = 0; i < 6; i++) {
				StatTableRow row = statRow.get(i); 
				row.setStatScore(clickedCharacter.getStats().get(i));
				statRow.set(i, row);
			}
			
			updateStatsTableView();
			
//			int str = clickedCharacter.getStats().get(0);
//			int dex = clickedCharacter.getStats().get(1);
//			int con = clickedCharacter.getStats().get(2);
//			int inte = clickedCharacter.getStats().get(3);
//			int wis = clickedCharacter.getStats().get(4);
//			int cha = clickedCharacter.getStats().get(5);
//					
//			textFieldStr.setText(String.valueOf(str));
//			textFieldDex.setText(String.valueOf(dex));
//			textFieldCon.setText(String.valueOf(con));
//			textFieldInt.setText(String.valueOf(inte));
//			textFieldWis.setText(String.valueOf(wis));
//			textFieldCha.setText(String.valueOf(cha));
//			
//			modLabelStr.setText(String.valueOf(
//					clickedCharacter.calculateMod(str)));
//			modLabelDex.setText(String.valueOf(
//					clickedCharacter.calculateMod(dex)));
//			modLabelCon.setText(String.valueOf(
//					clickedCharacter.calculateMod(con)));
//			modLabelInt.setText(String.valueOf(
//					clickedCharacter.calculateMod(inte)));
//			modLabelWis.setText(String.valueOf(
//					clickedCharacter.calculateMod(wis)));
//			modLabelCha.setText(String.valueOf(
//					clickedCharacter.calculateMod(cha)));
			

		} else {
			
		}
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