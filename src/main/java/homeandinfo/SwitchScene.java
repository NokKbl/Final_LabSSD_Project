package homeandinfo;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * SwitchScene class is a class that use for switch scene from one scene to another scene.
 * @author Kunyaruk Katebunlu
 */
public class SwitchScene {
	
	/**
	 * Switch the scene from one to another by put the fxml file's location.
	 * @param resourseFile is a String which tells a location of an fxml file that will switch to.
	 * @throws IOException if FXMLLoader cannot get resource from file.
	 */
	public void switchScene(ActionEvent event, String resourseFile) throws IOException {
		Parent view = FXMLLoader.load(getClass().getResource(resourseFile));
		Scene scene = new Scene(view);
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(scene);
		window.show();
	}

	/**
	 * Switch the scene from one to another by put the fxml file's location.
	 * @param menuBar is a MenuBar which user use to select where to go.
	 * @param resourseFile is a String which tells a location of an fxml file that will switch to.
	 * @throws IOException if FXMLLoader cannot get resource from file.
	 */
	public void menuBarSwitchScene(MenuBar menuBar, String resourseFile) throws IOException {
		Parent view = FXMLLoader.load(getClass().getResource(resourseFile));
		Scene scene = new Scene(view);
		Stage window = (Stage) menuBar.getScene().getWindow();

		window.setScene(scene);
		window.show();
	}
	
}
