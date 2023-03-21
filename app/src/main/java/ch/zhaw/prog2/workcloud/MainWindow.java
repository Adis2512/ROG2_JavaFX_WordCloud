package ch.zhaw.prog2.workcloud;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindow extends Application {



    @Override
    public void start(Stage primaryStage) throws IOException {
        openMainWindow(primaryStage);
    }

    private void openMainWindow(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("workcloud/MainWindow.fxml")); //FXML-Datei laden
        Pane rootNode = loader.load(); //FXML-Datei in rootNode laden
        Scene scene = new Scene(rootNode); //Scene mit rootNode erstellen
        stage.setScene(scene); //Scene dem Stage zuweisen
        stage.show(); //leeres Fenster anzeigen
    }
}
