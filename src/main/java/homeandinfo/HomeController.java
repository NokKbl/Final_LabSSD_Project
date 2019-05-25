package homeandinfo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

/**
 * UI controller of HomeUI.fxml for events and initializing components.
 * @author Kunyaruk Katebunlu
 */
public class HomeController {
	@FXML Button howto;
	@FXML Button unitconvert;
	@FXML Button currencyconvert;
	private SwitchScene newScene = new SwitchScene();
	
	/** Go to Window that let user convert the unit that user want. */
	@FXML
	public void handleUnitConvert(ActionEvent event) throws IOException {
		newScene.switchScene(event, "/fxml/UnitConverterUI.fxml");
	}
	
	/** Go to Window that let user convert the currency from THB to other currency that user want. */
	@FXML
	public void handleCurrencyConverter(ActionEvent event) throws IOException {
		newScene.switchScene(event, "/fxml/CurrencyConverterUI.fxml");
	}
	
	/** Go to Window that use to show the information of the application. */
	@FXML
	public void handleShowInfo(ActionEvent event) throws IOException {
		newScene.switchScene(event, "/fxml/InfoUI.fxml");
	}
}
