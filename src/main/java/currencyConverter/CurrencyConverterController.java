package currencyConverter;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import homeandinfo.SwitchScene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

/**
 * UI controller of CurrencyConverterUI.fxml for events and initializing components.
 * @author Kunyaruk Katebunlu
 */
public class CurrencyConverterController {
	@FXML TextField input1;
	@FXML TextField input2;
	@FXML private ComboBox<String> unitbox1;
	@FXML Button convert;
	@FXML Button clear;
	@FXML MenuBar menuBar;
	private SwitchScene newScene = new SwitchScene();
	private CurrencyConverter ccinstance = CurrencyConverter.getCurrencyInstance();

	@FXML
	public void initialize(){
		handleCurrencySelected();
	}

	/** Event handler for get unit for currency from CurrencyConverter */
	public void handleCurrencySelected() {
		String[] units = ccinstance.getUnits();
		unitbox1.getItems().clear();
		if(unitbox1 != null) {
			unitbox1.getItems().addAll(units);
			unitbox1.getSelectionModel().select(0);
		}
	}

	/** Convert a value from one unit to another. */
	public void handleConvert(ActionEvent event) {
		String unit1 = unitbox1.getValue();
		String text = input1.getText().trim();
		String result;
		double input;

		input1.setStyle("-fx-text-fill: black");
		try {
			if(!text.isEmpty()) {
				input = Double.parseDouble(text);
				result = String.format("%.2f", ccinstance.convertCurrency(input, unit1));
				input2.setText(result);
			}
		} catch(NumberFormatException num) {
			if(!text.isEmpty()) {
				input2.setText("Invalid number");
				input2.setStyle("-fx-text-fill: red");
			}
		} catch(Exception e) {
			input1.setText("");
			input2.setText("");
		}
	}

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

	/** Go to Window that let user convert the unit that user want. */
	@FXML
	public void handleUnitConvert(ActionEvent event) throws IOException {
		newScene.menuBarSwitchScene(menuBar, "/fxml/UnitConverterUI.fxml");
	}

	/** Exit system */
	public void handleExit(ActionEvent event) {
		System.exit(0);
	}
}
