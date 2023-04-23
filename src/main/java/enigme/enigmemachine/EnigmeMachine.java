package enigme.enigmemachine;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EnigmeMachine extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/View/main.fxml"));
            Parent root = fxmlLoader.load();
            getClass().getClassLoader().getResource("/Controller/MainController");
            Scene scene = new Scene(root);
            stage.setTitle("Enigme Machine");
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){ System.out.println(e.getMessage()); }
    }


    public static void main(String[] args) {
        launch();
    }
}