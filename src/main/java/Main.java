
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

/**
 * A main class for the Unit Converter application.
 * It is responsible for running the game UI.
 * @author Kunyaruk Katebunlu
 */
public class Main extends Application {
    /**
     * The start method is called after the init method has returned,
     * and after the system is ready for the application to begin running.
     * @param primaryStage is the stage for this application which the application scene can be set.
     */
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = (Parent)FXMLLoader.load(getClass().getResource("/fxml/HomeUI.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setTitle("- Converter -");
            primaryStage.sizeToScene();
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Main method for lunch the application.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
