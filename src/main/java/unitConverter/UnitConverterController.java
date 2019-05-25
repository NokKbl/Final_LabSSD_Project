package unitConverter;

import homeandinfo.SwitchScene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

/**
 * UI controller of UnitConverterUI.fxml for events and initializing components.
 * @author Kunyaruk Katebunlu
 */
public class UnitConverterController {
	@FXML TextField input1;
	@FXML TextField input2;
	@FXML private ComboBox<Unit<?>> unitbox1;
	@FXML private ComboBox<Unit<?>> unitbox2;
	@FXML Button convert;
	@FXML Button clear;
	@FXML MenuBar menuBar;
	private UnitFactory factory = UnitFactory.getInstance();
	private SwitchScene newScene = new SwitchScene();
	
	/** Clear TextField if mouse pressed on TextField */
	@FXML
	public void handleTextFieldPressed() {
		input1.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            	input1.clear();
        		input1.setStyle("-fx-text-fill: black");
        		input2.clear();
        		input2.setStyle("-fx-text-fill: black");
            }
        });
		
		input2.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
            	input1.clear();
        		input1.setStyle("-fx-text-fill: black");
        		input2.clear();
        		input2.setStyle("-fx-text-fill: black");
            }
        });
	}
	
	/** Event handler for selecting a unittype using a menu item. */
	public void handleUnitSelected(ActionEvent event) {
		MenuItem mitem = (MenuItem) event.getSource();
		String unitname = mitem.getText();
		UnitType unittype = UnitType.valueOf(unitname);
		loadUnits(unittype);
	}
	
	/**
	 * Get the units of unittype from the UnitFactory.
	 * @param unittype is a unit type that want to get units.
	 */
	public void loadUnits(UnitType unittype) {
		Unit<?>[] units = factory.getUnits(unittype);
		unitbox1.getItems().clear();
		unitbox2.getItems().clear();
		if(unitbox1 != null) {
			unitbox1.getItems().addAll(units);
			unitbox1.getSelectionModel().select(0);
		}
		if(unitbox2 != null) {
			unitbox2.getItems().addAll(units);
			unitbox2.getSelectionModel().select(1);
		}
	}
	
	/** Convert a value from one unit to another. */
	public void handleConvert(ActionEvent event) {
		Unit<?> unit1 = unitbox1.getValue();
		Unit<?> unit2 = unitbox2.getValue();
		String text = input1.getText().trim();
		String text2 = input2.getText().trim();
		String result;
		double input;
		
		input1.setStyle("-fx-text-fill: black");
		input2.setStyle("-fx-text-fill: black");
		try {
			if(!text.isEmpty()) {
				input = Double.parseDouble(text);
				result = String.format("%.5g", unit1.convert(input, unit2));
				input2.setText(result);
			} else if(!text2.isEmpty()) {
				input = Double.parseDouble(text2);
				result = String.format("%.5g", unit2.convert(input, unit1));
				input1.setText(result);
			}
		} catch(NumberFormatException num) {
			if(!text.isEmpty()) {
				input2.setText("Invalid number");
				input2.setStyle("-fx-text-fill: red");
			} else if(!text2.isEmpty()) {
				input1.setText("Invalid number");
				input1.setStyle("-fx-text-fill: red");
			}
		} catch(Exception e) {
			input1.setText("");
			input2.setText("");
		}
	}
	
	/** Clear all TextFields */
	@FXML
	public void handleClear(ActionEvent event) {
		input1.clear();
		input1.setStyle("-fx-text-fill: black");
		input2.clear();
		input2.setStyle("-fx-text-fill: black");
	}

	/** Go to Window that use to show the information of the application. */
	@FXML
	public void handleShowInfo(ActionEvent event) throws IOException {
		newScene.menuBarSwitchScene(menuBar, "/fxml/InfoUI.fxml");
	}

	/** Go to Window that use to show the information of the application. */
	@FXML
	public void handleBackHome(ActionEvent event) throws IOException {
		newScene.menuBarSwitchScene(menuBar, "/fxml/HomeUI.fxml");
	}

	/** Go to Window that let user convert the currency from THB to other currency that user want. */
	@FXML
	public void handleCurrencyConverter(ActionEvent event) throws IOException {
		newScene.menuBarSwitchScene(menuBar, "/fxml/CurrencyConverterUI.fxml");
	}
	
	/** Exit system */
	public void handleExit(ActionEvent event) {
		System.exit(0);
	}

}
