package group;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Autogenerated JavaFX App class
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("Login"), 900, 540);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    /**
     * Method to set the root of the current scene.
     * 
     * @param fxml Name of the fxml file to be set as the root.
     * @throws IOException When fxml file does not exist.
     */
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    /**
     * Loads fxml file into a parent object.
     * 
     * @param fxml Name of the fxml file to be loaded.
     * @return Parent objecting containing fxml file.
     * @throws IOException When fxml file does not exist.
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /**
     * Main method to run the software
     * @param args arguments provided to main
     */
    public static void main(String[] args) {
        launch();
    }

}